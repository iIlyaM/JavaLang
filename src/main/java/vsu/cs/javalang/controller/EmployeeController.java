package vsu.cs.javalang.controller;

import org.springframework.web.bind.annotation.*;
import vsu.cs.javalang.dto.DisplayEmployeeDto;
import vsu.cs.javalang.dto.EmployeeDto;
import vsu.cs.javalang.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee/new")
    public void registerNewEmployee(@RequestBody EmployeeDto employeeDto) {
        employeeService.addEmployee(employeeDto);
    }

    @GetMapping("/employee/{id}")
    public DisplayEmployeeDto get(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/employee/employees")
    public List<DisplayEmployeeDto> getEmployees() {
        return employeeService.getEmployees();
    }

    @PutMapping("/employee/{id}")
    public void updateEmployee(@PathVariable Integer id, @RequestBody EmployeeDto employeeDto) {
        employeeService.updateEmployee(id, employeeDto);
    }

    @DeleteMapping("/employee/{id}")
    public void removeEmployee(@PathVariable Integer id) {
        employeeService.removeEmployee(id);
    }
}
