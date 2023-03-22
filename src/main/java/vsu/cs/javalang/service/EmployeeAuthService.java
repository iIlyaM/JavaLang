package vsu.cs.javalang.service;

import org.springframework.stereotype.Service;
import vsu.cs.javalang.dto.EmployeeAuthDto;
import vsu.cs.javalang.mapper.EmployeeAuthMapper;
import vsu.cs.javalang.repository.EmployeeAuthRepository;

@Service
public class EmployeeAuthService {
    private final EmployeeAuthMapper employeeAuthMapper;
    private final EmployeeAuthRepository employeeAuthRepository;

    public EmployeeAuthService(EmployeeAuthMapper employeeAuthMapper, EmployeeAuthRepository employeeAuthRepository) {
        this.employeeAuthMapper = employeeAuthMapper;
        this.employeeAuthRepository = employeeAuthRepository;
    }

    public void addAuth(EmployeeAuthDto client) {
        employeeAuthRepository.save(employeeAuthMapper.toEntity(client));
    }


}
