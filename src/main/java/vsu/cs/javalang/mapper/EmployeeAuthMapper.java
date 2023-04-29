package vsu.cs.javalang.mapper;

import org.mapstruct.Mapper;
import vsu.cs.javalang.dto.DisplayAuthDto;
import vsu.cs.javalang.dto.EmployeeAuthDto;
import vsu.cs.javalang.entity.EmployeeAuth;

@Mapper(componentModel = "spring")
public interface EmployeeAuthMapper {

    EmployeeAuthDto fromEntity(EmployeeAuth employeeAuth);

    DisplayAuthDto toDisplayDto(EmployeeAuth employeeAuth);

    EmployeeAuth toEntity(EmployeeAuthDto employeeAuthDto);

    EmployeeAuth toEntity(DisplayAuthDto employeeAuthDto);
}
