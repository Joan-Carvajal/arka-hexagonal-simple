package com.enyoi.arka.adapters.out.repository.entity;

import com.enyoi.arka.domain.entities.OrderStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    private String id;

    @Column(nullable = false)
    private String customerId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus orderStatus;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = true)
    @JoinColumn(name = "orderId",nullable = false)
    private List<OrderItemEntity> items;

    public OrderEntity() {
    }

    public OrderEntity(String id, String customerId, OrderStatus orderStatus, LocalDateTime createdAt, List<OrderItemEntity> items) {
        this.id = id;
        this.customerId = customerId;
        this.orderStatus = orderStatus;
        this.createdAt = createdAt;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<OrderItemEntity> getItems() {
        return items;
    }
}
