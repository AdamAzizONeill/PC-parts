package com.ecommerce.pcparts.repositories;

import com.ecommerce.pcparts.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {
}
