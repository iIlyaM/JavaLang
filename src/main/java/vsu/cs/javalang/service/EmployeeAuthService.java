package vsu.cs.javalang.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import vsu.cs.javalang.dto.DisplayAuthDto;
import vsu.cs.javalang.dto.EmployeeAuthDto;
import vsu.cs.javalang.entity.EmployeeAuth;
import vsu.cs.javalang.mapper.EmployeeAuthMapper;
import vsu.cs.javalang.repository.EmployeeAuthRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeAuthService {
    private final EmployeeAuthMapper employeeAuthMapper;
    private final EmployeeAuthRepository employeeAuthRepository;

    public EmployeeAuthService(EmployeeAuthMapper employeeAuthMapper, EmployeeAuthRepository employeeAuthRepository) {
        this.employeeAuthMapper = employeeAuthMapper;
        this.employeeAuthRepository = employeeAuthRepository;
    }

    public void addAuth(EmployeeAuthDto auth) {
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
        EmployeeAuth employeeAuth = new EmployeeAuth();
        employeeAuth.setEmail(auth.getEmail());
        employeeAuth.setPassword(bc.encode(auth.getPassword()));
        employeeAuth.setUserName(auth.getUserName());
        employeeAuthRepository.save(employeeAuth);
    }

    public DisplayAuthDto findById(Integer id) {
        Optional<EmployeeAuth> employeeAuth  = employeeAuthRepository.findAll()
                .stream().filter(val -> val.getId().equals(id))
                .findFirst();
        return employeeAuthMapper.toDisplayDto(employeeAuth.orElseGet(employeeAuth::orElseThrow));
    }

    public List<DisplayAuthDto> findAll() {
        return employeeAuthRepository.findAll()
                .stream().map(employeeAuthMapper::toDisplayDto)
                .collect(Collectors.toList());
    }

    public void removeAuth(Integer id) {
        employeeAuthRepository.deleteById(id);
    }

    public void updateAuth(Integer id, EmployeeAuthDto employeeAuthDto) {
        EmployeeAuth employeeAuth = employeeAuthRepository.findById(id).get();
        employeeAuth.setUserName(employeeAuthDto.getUserName());
        employeeAuth.setEmail(employeeAuthDto.getEmail());
        employeeAuth.setPassword(employeeAuthDto.getPassword());
        employeeAuthRepository.save(employeeAuth);
    }
}
