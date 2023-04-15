package vsu.cs.javalang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vsu.cs.javalang.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
