package vsu.cs.javalang.dto;

import lombok.Data;
@Data
public class EmployeeDto {
    private String firstName;
    private String lastName;
    private Double salary;
    private DisplayAuthDto displayAuthDto;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public DisplayAuthDto getDisplayAuthDto() {
        return displayAuthDto;
    }

    public void setDisplayAuthDto(DisplayAuthDto displayAuthDto) {
        this.displayAuthDto = displayAuthDto;
    }
}
