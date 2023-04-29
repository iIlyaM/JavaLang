package vsu.cs.javalang.mapper;

import org.mapstruct.Mapper;
import vsu.cs.javalang.dto.DisplayFuelDto;
import vsu.cs.javalang.dto.FuelDto;
import vsu.cs.javalang.entity.Fuel;

@Mapper(componentModel = "spring")
public interface FuelMapper {

    FuelDto fromEntity(Fuel fuel);

    DisplayFuelDto toDisplayDto(Fuel fuel);

    Fuel toEntity(FuelDto fuelDto);

    Fuel toEntity(DisplayFuelDto fuelDto);
}
