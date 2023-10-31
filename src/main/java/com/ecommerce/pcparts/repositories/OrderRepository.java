package com.ecommerce.pcparts.repositories;

import com.ecommerce.pcparts.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
