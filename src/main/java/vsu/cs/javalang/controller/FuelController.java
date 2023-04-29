package vsu.cs.javalang.controller;

import org.springframework.web.bind.annotation.*;
import vsu.cs.javalang.dto.DisplayFuelDto;
import vsu.cs.javalang.dto.FuelDto;
import vsu.cs.javalang.service.FuelService;

import java.util.List;

@RestController
public class FuelController {
    private final FuelService fuelService;

    public FuelController(FuelService fuelService) {
        this.fuelService = fuelService;
    }

    @PostMapping("/fuel/new")
    public void addFuel(@RequestBody FuelDto fuelDto) {
        fuelService.addFuel(fuelDto);
    }

    @GetMapping("/fuel/{id}")
    public DisplayFuelDto getFuelById(@PathVariable Integer id) {
        return fuelService.getFuelById(id);
    }

    @GetMapping("/fuel/fuels")
    public List<DisplayFuelDto> getFuels() {
        return fuelService.getFuels();
    }

    @PutMapping("/fuel/{id}")
    public void updateFuelData(@PathVariable Integer id, @RequestBody FuelDto fuelDto) {
        fuelService.updateFuelData(id, fuelDto);
    }

    @DeleteMapping("/fuel/{id}")
    public void removeFuel(@PathVariable Integer id) {
        fuelService.removeFuel(id);
    }
}

