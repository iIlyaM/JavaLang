package vsu.cs.javalang.dto;

import lombok.Data;
import vsu.cs.javalang.entity.Fuel;

import java.util.List;

@Data
public class FillingMachineDto {
    private Double counter;
    private List<FuelDto> tanks;

    public Double getCounter() {
        return counter;
    }

    public void setCounter(Double counter) {
        this.counter = counter;
    }

    public List<FuelDto> getTanks() {
        return tanks;
    }

    public void setTanks(List<FuelDto> tanks) {
        this.tanks = tanks;
    }
}
