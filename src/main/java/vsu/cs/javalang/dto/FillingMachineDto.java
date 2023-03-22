package vsu.cs.javalang.dto;

import lombok.Data;

@Data
public class FillingMachineDto {
    private Double counter;

    public Double getCounter() {
        return counter;
    }

    public void setCounter(Double counter) {
        this.counter = counter;
    }
}
