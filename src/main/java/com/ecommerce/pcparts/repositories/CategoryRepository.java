package com.ecommerce.pcparts.repositories;

import com.ecommerce.pcparts.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
