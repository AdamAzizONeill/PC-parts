package com.ecommerce.pcparts.repositories;

import com.ecommerce.pcparts.models.SupplierProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupplierProductRepository extends JpaRepository<SupplierProduct, UUID> {
}
