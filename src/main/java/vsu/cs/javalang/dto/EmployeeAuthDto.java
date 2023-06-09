package vsu.cs.javalang.dto;

import lombok.Data;

@Data
public class EmployeeAuthDto {

    private String email;
    private String userName;
    private String password;
    private DisplayEmployeeDto displayEmployeeDto;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DisplayEmployeeDto getDisplayEmployeeDto() {
        return displayEmployeeDto;
    }

    public void setDisplayEmployeeDto(DisplayEmployeeDto displayEmployeeDto) {
        this.displayEmployeeDto = displayEmployeeDto;
    }
}
