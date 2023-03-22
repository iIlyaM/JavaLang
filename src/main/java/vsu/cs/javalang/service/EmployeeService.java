package vsu.cs.javalang.service;

import org.springframework.stereotype.Service;
import vsu.cs.javalang.dto.EmployeeDto;
import vsu.cs.javalang.mapper.EmployeeMapper;
import vsu.cs.javalang.repository.EmployeeRepository;

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
}
