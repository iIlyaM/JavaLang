package vsu.cs.javalang.controller;

import org.springframework.web.bind.annotation.*;
import vsu.cs.javalang.dto.DisplayAuthDto;
import vsu.cs.javalang.dto.EmployeeAuthDto;
import vsu.cs.javalang.service.EmployeeAuthService;

import java.util.List;

@RestController
public class EmployeeAuthController {
    private final EmployeeAuthService authService;

    public EmployeeAuthController(EmployeeAuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/employee/auth/new")
    public void registerNewEmployee(@RequestBody EmployeeAuthDto employeeAuthDto) {
        authService.addAuth(employeeAuthDto);
    }

    @GetMapping("/employee/auth/{id}")
    public DisplayAuthDto get(@PathVariable Integer id) {
        return authService.findById(id);
    }

    @GetMapping("/employee/auths")
    public List<DisplayAuthDto> getAll() {
        return authService.findAll();
    }

    @DeleteMapping("/employee/auth/{id}")
    public void removeAuth(@PathVariable Integer id) {
        authService.removeAuth(id);
    }

    @PutMapping("/employee/auth/{id}")
    public void updateAuth(@PathVariable Integer id, @RequestBody EmployeeAuthDto employeeAuthDto) {
        authService.updateAuth(id, employeeAuthDto);
    }
}
