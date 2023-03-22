package vsu.cs.javalang.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_auth")
public class EmployeeAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auth_id")
    private Integer id;

    private String email;

    private String userName;
    private String password;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public EmployeeAuth(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public EmployeeAuth() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
