package vsu.cs.javalang.mapper;


import org.mapstruct.Mapper;
import vsu.cs.javalang.dto.DisplayEmployeeDto;
import vsu.cs.javalang.dto.EmployeeDto;
import vsu.cs.javalang.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee toEntity(EmployeeDto employee);

    Employee toEntity(DisplayEmployeeDto displayEmployeeDto);

    EmployeeDto fromEntity(Employee employee);

    DisplayEmployeeDto toDisplayDto(Employee employee);




}
