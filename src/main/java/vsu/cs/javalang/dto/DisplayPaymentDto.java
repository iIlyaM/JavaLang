package vsu.cs.javalang.dto;

import lombok.Data;

@Data
public class DisplayPaymentDto {
    private Integer id;
    private Integer clientCardNumber;
    private Double amount;
    private Double sum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
