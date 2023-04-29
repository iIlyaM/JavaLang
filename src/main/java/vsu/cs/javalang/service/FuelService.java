package vsu.cs.javalang.service;

import org.springframework.stereotype.Service;
import vsu.cs.javalang.dto.DisplayFuelDto;
import vsu.cs.javalang.dto.FuelDto;
import vsu.cs.javalang.entity.Fuel;
import vsu.cs.javalang.entity.enums.FuelType;
import vsu.cs.javalang.mapper.FuelMapper;
import vsu.cs.javalang.repository.FuelRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FuelService {
    private final FuelMapper fuelMapper;
    private final FuelRepository fuelRepository;

    public FuelService(FuelMapper fuelMapper, FuelRepository fuelRepository) {
        this.fuelMapper = fuelMapper;
        this.fuelRepository = fuelRepository;
    }

    public void addFuel(FuelDto fuelDto) {
        Fuel fuel = new Fuel();
        fuel.setType(FuelType.decode(fuelDto.getType()));
        fuel.setPrice(fuelDto.getPrice());
        fuel.setFuelAmount(fuelDto.getFuelAmount());
        fuelRepository.save(fuel);
    }

    public DisplayFuelDto getFuelById(Integer id) {
        Optional<Fuel> employee = fuelRepository.findAll()
                .stream().filter(val -> val.getId().equals(id))
                .findFirst();
        return fuelMapper.toDisplayDto(employee.orElseGet(employee::orElseThrow));
    }

    public List<DisplayFuelDto> getFuels() {
        return fuelRepository.findAll()
                .stream().map(fuelMapper::toDisplayDto)
                .collect(Collectors.toList());
    }

    public void updateFuelData(Integer id, FuelDto fuelDto) {
        Fuel fuel = fuelRepository.findById(id).get();
        fuel.setType(FuelType.decode(fuelDto.getType()));
        fuel.setPrice(fuelDto.getPrice());
        fuel.setFuelAmount(fuelDto.getFuelAmount());
        fuelRepository.save(fuel);
    }

    public void removeFuel(Integer id) {
        fuelRepository.deleteById(id);
    }

}
