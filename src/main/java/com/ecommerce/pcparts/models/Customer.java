package com.ecommerce.pcparts.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;


import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @NotNull
    @Column(name = "firstname")
    private String firstName;

    @NotNull
    @Column(name = "lastname")
    private String lastName;

    @NotNull
    @Column(unique = true, name="email")
    private String email;

    @NotNull
    @Column(name = "phone")
    private String phone;

    @NotNull
    @Column(name = "address_line1")
    private String addressLine1;

    @NotNull
    @Column(name = "address_line2")
    private String addressLine2;

    @NotNull
    @Column(name = "county")
    private String county;

    @NotNull
    @Column(name = "city")
    private String city;

    @Size(min=6, max=9)
    @Column(name = "postcode")
    private String postcode;

    @Min(10000000)
    @Max(99999999)
    @Column(name = "accountNumber")
    private int accountNumber;

    @Min(100000)
    @Max(999999)
    @Column(name = "sort_code")
    private int sortCode;

    @Min(100)
    @Max(999)
    @Column(name = "security_number")
    private int securityNumber;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer", orphanRemoval = true)
    private List<Cart> carts;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer", orphanRemoval = true)
    private List<Wishlist> wishlists;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer", orphanRemoval = true)
    private List<Payment> payments;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer", orphanRemoval = true)
    private List<Shipment> shipments;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer", orphanRemoval = true)
    private List<Order> orders;
}
