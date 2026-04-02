package com.enyoi.arka.adapters.out.repository.entity;

import com.enyoi.arka.domain.entities.ProductCategory;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Currency;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(length = 100)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private String currency;
    @Column(nullable = false)
    private int stock;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductCategory category;

    public ProductEntity() {
    }

    public ProductEntity(String id,
                         String name,
                         String description,
                         BigDecimal price,
                         String currency,
                         int stock,
                         ProductCategory category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
        this.stock = stock;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public int getStock() {
        return stock;
    }

    public ProductCategory getCategory() {
        return category;
    }
}
