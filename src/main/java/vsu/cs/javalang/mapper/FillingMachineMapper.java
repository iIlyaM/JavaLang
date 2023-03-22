package vsu.cs.javalang.mapper;

import org.mapstruct.Mapper;
import vsu.cs.javalang.dto.FillingMachineDto;
import vsu.cs.javalang.entity.FillingMachine;

@Mapper(componentModel = "spring")
public interface FillingMachineMapper {

    FillingMachineDto fromEntity(FillingMachine fillingMachine);

    FillingMachine toEntity(FillingMachineDto fillingMachineDto);
}
