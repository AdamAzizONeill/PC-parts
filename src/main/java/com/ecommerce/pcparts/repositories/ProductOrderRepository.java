package com.ecommerce.pcparts.repositories;

import com.ecommerce.pcparts.models.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, UUID> {
}
