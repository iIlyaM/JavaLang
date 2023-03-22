package vsu.cs.javalang.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vsu.cs.javalang.dto.FuelDto;
import vsu.cs.javalang.service.FuelService;

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
}

