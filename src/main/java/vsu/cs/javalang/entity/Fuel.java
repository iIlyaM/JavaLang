package vsu.cs.javalang.entity;

import jakarta.persistence.*;
import vsu.cs.javalang.entity.enums.FuelType;

import java.util.List;

@Entity
@Table(name = "fuel")
public class Fuel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private FuelType type;
    private Double price;

    private Double fuelAmount;

    @ManyToMany(mappedBy = "tanks")
    private List<FillingMachine> machines;



    public Fuel(FuelType type, Double price, Double fuelAmount) {
        this.type = type;
        this.price = price;
        this.fuelAmount = fuelAmount;
    }

    public Fuel() {

    }

    public FuelType getType() {
        return type;
    }

    public void setType(FuelType type) {
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

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
