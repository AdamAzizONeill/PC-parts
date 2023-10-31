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
public class SupplierProduct {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @NotNull
    @Column(name = "product_supply_url")
    private String productSuppleUrl;

    @NotNull
    @Column(name = "status")
    private String status;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "supplier_id", nullable=false)
    private Supplier supplier;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "product_id", nullable=false)
    private Product product;

}
