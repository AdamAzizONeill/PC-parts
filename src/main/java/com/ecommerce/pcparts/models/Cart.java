package com.ecommerce.pcparts.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable=false)
    private Customer customer;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "product_id", nullable=false)
    private Product product;
}
