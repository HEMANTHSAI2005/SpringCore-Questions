package com.hemanth.springdemo.q7.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Sales")
public class Sales {

    @Id
    @Column(name = "sale_id")
    private Integer saleId;

    @ManyToOne
    @JoinColumn(name = "pro_id")
    private Product product;

    private Integer quantity;

    @Column(name = "price_per_unit")
    private Double pricePerUnit;

    @Column(name = "sale_date")
    private LocalDate saleDate;

    public Sales() {
    }

    public Integer getSaleId() {
        return saleId;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }
}