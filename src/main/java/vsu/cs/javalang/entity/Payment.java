package vsu.cs.javalang.entity;

import jakarta.persistence.*;

@Entity
@Table(name="payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "integer_id")
    private Integer id;

    private Integer clientCardNumber;

    private Double amount;

    private Double sum;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Payment(Integer clientCardNumber, Double amount, Double sum) {
        this.clientCardNumber = clientCardNumber;
        this.amount = amount;
        this.sum = sum;
    }

    public Payment() {
    }

    public Integer getClientCardNumber() {
        return clientCardNumber;
    }

    public void setClientCardNumber(Integer clientCardNumber) {
        this.clientCardNumber = clientCardNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
