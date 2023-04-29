package vsu.cs.javalang.service;

import org.springframework.stereotype.Service;
import vsu.cs.javalang.dto.DisplayEmployeeDto;
import vsu.cs.javalang.dto.EmployeeDto;
import vsu.cs.javalang.entity.Employee;
import vsu.cs.javalang.entity.EmployeeAuth;
import vsu.cs.javalang.mapper.EmployeeMapper;
import vsu.cs.javalang.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeMapper employeeMapper;

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeMapper employeeMapper, EmployeeRepository employeeRepository) {
        this.employeeMapper = employeeMapper;
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(EmployeeDto employee) {
        employeeRepository.save(employeeMapper.toEntity(employee));
    }

    public DisplayEmployeeDto getEmployeeById(Integer id) {
        Optional<Employee> employee = employeeRepository.findAll()
                .stream().filter(val -> val.getId().equals(id))
                .findFirst();
        return employeeMapper.toDisplayDto(employee.orElseGet(employee::orElseThrow));
    }

    public List<DisplayEmployeeDto> getEmployees() {
        return employeeRepository.findAll()
                .stream().map(employeeMapper::toDisplayDto)
                .collect(Collectors.toList());
    }

    public void updateEmployee(Integer id, EmployeeDto employeeDto) {
        Employee employee = employeeRepository.findById(id).get();
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setSalary(employeeDto.getSalary());
        employeeRepository.save(employee);
    }

    public void removeEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
