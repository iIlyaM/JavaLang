package vsu.cs.javalang.service;

import org.springframework.stereotype.Service;
import vsu.cs.javalang.dto.EmployeeAuthDto;
import vsu.cs.javalang.dto.FuelDto;
import vsu.cs.javalang.entity.enums.FuelType;
import vsu.cs.javalang.mapper.FuelMapper;
import vsu.cs.javalang.repository.FuelRepository;

@Service
public class FuelService {
    private final FuelMapper fuelMapper;
    private final FuelRepository fuelRepository;

    public FuelService(FuelMapper fuelMapper, FuelRepository fuelRepository) {
        this.fuelMapper = fuelMapper;
        this.fuelRepository = fuelRepository;
    }

    public void addFuel(FuelDto fuel) {
        var val = fuelMapper.toEntity(fuel);
        val.setType(FuelType.decode(fuel.getType()));
        fuelRepository.save(fuelMapper.toEntity(fuel));
    }
}
