package com.ecommerce.pcparts.repositories;

import com.ecommerce.pcparts.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
