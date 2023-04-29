package vsu.cs.javalang.dto;

import jakarta.persistence.ManyToMany;
import lombok.Data;
import vsu.cs.javalang.entity.Fuel;

import java.util.List;

@Data
public class DisplayFillingMachineDto {
    private Integer id;
    private Double counter;
    private List<Fuel> tanks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCounter() {
        return counter;
    }

    public void setCounter(Double counter) {
        this.counter = counter;
    }

    public List<Fuel> getTanks() {
        return tanks;
    }

    public void setTanks(List<Fuel> tanks) {
        this.tanks = tanks;
    }
}
