package com.ecommerce.pcparts.repositories;

import com.ecommerce.pcparts.models.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WishlistRepository extends JpaRepository<Wishlist, UUID> {
}
