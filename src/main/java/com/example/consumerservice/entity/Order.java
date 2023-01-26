package com.example.consumerservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    private UUID id;

    @Column(length = 8, nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(length = 2048)
    private String payload;
}
