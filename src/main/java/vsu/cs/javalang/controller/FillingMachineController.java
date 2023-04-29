package vsu.cs.javalang.controller;

import org.springframework.web.bind.annotation.*;
import vsu.cs.javalang.dto.DisplayFillingMachineDto;
import vsu.cs.javalang.dto.FillingMachineDto;
import vsu.cs.javalang.service.FillingMachineService;

import java.util.List;

@RestController
public class FillingMachineController {
    private final FillingMachineService fillingMachineService;

    public FillingMachineController(FillingMachineService fillingMachineService) {
        this.fillingMachineService = fillingMachineService;
    }

    @PostMapping("/filling_machine/new")
    public void addMachine(@RequestBody FillingMachineDto fillingMachineDto) {
        fillingMachineService.addMachine(fillingMachineDto);
    }

    @GetMapping("/filling_machine/{id}")
    public DisplayFillingMachineDto getMachineById(@PathVariable Integer id) {
        return fillingMachineService.get(id);
    }

    @GetMapping("/filling_machine/filling_machines")
    public List<DisplayFillingMachineDto> getMachineById() {
        return fillingMachineService.getMachines();
    }

    @DeleteMapping("/filling_machine/{id}")
    public void removeAuth(@PathVariable Integer id) {
        fillingMachineService.removeMachine(id);
    }

    @PutMapping("/filling_machine/{id}")
    public void updateAuth(@PathVariable Integer id, @RequestBody FillingMachineDto fillingMachineDto) {
        fillingMachineService.updateFillingMachineData(id, fillingMachineDto);
    }
}
