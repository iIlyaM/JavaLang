package vsu.cs.javalang.service;

import org.springframework.stereotype.Service;
import vsu.cs.javalang.dto.DisplayFillingMachineDto;
import vsu.cs.javalang.dto.FillingMachineDto;
import vsu.cs.javalang.entity.FillingMachine;
import vsu.cs.javalang.entity.Fuel;
import vsu.cs.javalang.entity.enums.FuelType;
import vsu.cs.javalang.mapper.FillingMachineMapper;
import vsu.cs.javalang.mapper.FuelMapper;
import vsu.cs.javalang.repository.FillingMachineRepository;
import vsu.cs.javalang.repository.FuelRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FillingMachineService {
    private final FillingMachineMapper fillingMachineMapper;

    private final FuelMapper fuelMapper;
    private final FillingMachineRepository fillingMachineRepository;

    private final FuelRepository fuelRepository;

    public FillingMachineService(FillingMachineMapper fillingMachineMapper, FuelMapper fuelMapper, FillingMachineRepository fillingMachineRepository, FuelRepository fuelRepository) {
        this.fillingMachineMapper = fillingMachineMapper;
        this.fuelMapper = fuelMapper;
        this.fillingMachineRepository = fillingMachineRepository;
        this.fuelRepository = fuelRepository;
    }

    public void addMachine(FillingMachineDto fillingMachineDto) {
        FillingMachine fillingMachine = new FillingMachine();
        fillingMachine.setCounter(fillingMachine.getCounter());
        List<Fuel> tanksList = new ArrayList<>();
        Fuel fuel;
        for (var tank: fillingMachineDto.getTanks()) {
            fuel = new Fuel();
            fuel.setType(FuelType.decode(tank.getType()));
            fuel.setPrice(tank.getPrice());
            fuel.setFuelAmount(tank.getFuelAmount());
            fuelRepository.save(fuel);
            tanksList.add(fuel);
        }
        fillingMachine.setTanks(tanksList);
        fillingMachineRepository.save(fillingMachine);
    }

    public DisplayFillingMachineDto get(Integer id) {
        Optional<FillingMachine> fillingMachine = fillingMachineRepository.findAll()
                .stream().filter(val -> val.getId().equals(id))
                .findFirst();
        return fillingMachineMapper.toDisplayDto(fillingMachine.orElseGet(fillingMachine::orElseThrow));
    }

    public List<DisplayFillingMachineDto> getMachines() {
        return fillingMachineRepository.findAll()
                .stream().map(fillingMachineMapper::toDisplayDto)
                .collect(Collectors.toList());
    }

    public void updateFillingMachineData(Integer id, FillingMachineDto fillingMachineDto) {
        FillingMachine fillingMachine = fillingMachineRepository.findById(id).get();
        fillingMachine.setCounter(fillingMachineDto.getCounter());
        fillingMachineRepository.save(fillingMachine);
    }

    public void removeMachine(Integer id) {
        fillingMachineRepository.deleteById(id);
    }

}
