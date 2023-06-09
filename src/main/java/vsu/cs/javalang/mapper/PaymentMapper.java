package vsu.cs.javalang.mapper;

import org.mapstruct.Mapper;
import vsu.cs.javalang.dto.DisplayPaymentDto;
import vsu.cs.javalang.dto.PaymentDto;
import vsu.cs.javalang.entity.Payment;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    PaymentDto fromEntity(Payment payment);

    DisplayPaymentDto toDisplayDto(Payment payment);

    Payment toEntity(PaymentDto paymentDto);

    Payment toEntity(DisplayPaymentDto displayPaymentDto);
}
