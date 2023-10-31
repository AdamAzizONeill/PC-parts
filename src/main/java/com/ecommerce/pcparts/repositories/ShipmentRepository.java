package com.ecommerce.pcparts.repositories;

import com.ecommerce.pcparts.models.Category;
import com.ecommerce.pcparts.models.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShipmentRepository extends JpaRepository<Shipment, UUID> {
}
