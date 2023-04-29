package vsu.cs.javalang.dto;

import lombok.Data;
import vsu.cs.javalang.entity.enums.FuelType;

import java.util.List;

@Data
public class DisplayFuelDto {
    private Integer id;
    private String type;
    private Double price;
    private Double fuelAmount;
    private List<FillingMachineDto> machines;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(Double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public List<FillingMachineDto> getMachines() {
        return machines;
    }

    public void setMachines(List<FillingMachineDto> machines) {
        this.machines = machines;
    }
}
