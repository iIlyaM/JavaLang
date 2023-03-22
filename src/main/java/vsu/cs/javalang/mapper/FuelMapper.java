package vsu.cs.javalang.mapper;

import org.mapstruct.Mapper;
import vsu.cs.javalang.dto.FuelDto;
import vsu.cs.javalang.entity.Fuel;

@Mapper(componentModel = "spring")
public interface FuelMapper {

    FuelDto fromEntity(Fuel fuel);

    Fuel toEntity(FuelDto fuelDto);
}
