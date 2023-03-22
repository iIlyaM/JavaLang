package vsu.cs.javalang.mapper;

import org.mapstruct.Mapper;
import vsu.cs.javalang.dto.EmployeeAuthDto;
import vsu.cs.javalang.entity.EmployeeAuth;

@Mapper(componentModel = "spring")
public interface EmployeeAuthMapper {

    EmployeeAuthDto fromEntity(EmployeeAuth employeeAuth);

    EmployeeAuth toEntity(EmployeeAuthDto employeeAuthDto);
}
