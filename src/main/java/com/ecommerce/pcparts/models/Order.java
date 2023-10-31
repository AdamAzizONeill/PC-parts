package com.ecommerce.pcparts.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Table(name="orders")
@Entity
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name="total_price", precision = 10, scale = 2)
    @Positive
    @NotNull
    private BigDecimal total_price;

    @Positive
    @NotNull
    @Column(name = "quantity")
    private int quantity;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    @NotNull
    private Date orderDate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "order", orphanRemoval = true)
    private List<ProductOrder> productOrders;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable=false)
    private Customer customer;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "payment_id", nullable=false)
    private Payment payment;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "shipment_id", nullable=false)
    private Shipment shipment;

}
