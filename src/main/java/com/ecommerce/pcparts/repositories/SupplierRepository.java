package com.ecommerce.pcparts.repositories;

import com.ecommerce.pcparts.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupplierRepository extends JpaRepository<Supplier, UUID> {
}
