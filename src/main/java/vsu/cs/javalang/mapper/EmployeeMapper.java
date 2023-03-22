package vsu.cs.javalang.mapper;


import org.mapstruct.Mapper;
import vsu.cs.javalang.dto.EmployeeDto;
import vsu.cs.javalang.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee toEntity(EmployeeDto employee);

    EmployeeDto fromEntity(Employee employee);
}
