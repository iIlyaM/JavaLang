package vsu.cs.javalang.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="filling_machine")
public class FillingMachine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double counter;

    @ManyToMany
    private List<Fuel> tanks;

    public FillingMachine(Integer id, Double counter) {
        this.id = id;
        this.counter = counter;
    }


    public FillingMachine() {

    }

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
}
