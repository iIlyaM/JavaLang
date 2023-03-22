package vsu.cs.javalang.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vsu.cs.javalang.dto.EmployeeAuthDto;
import vsu.cs.javalang.entity.EmployeeAuth;
import vsu.cs.javalang.service.EmployeeAuthService;

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
}
