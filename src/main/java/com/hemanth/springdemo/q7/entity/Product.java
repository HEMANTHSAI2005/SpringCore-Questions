package com.hemanth.springdemo.q7.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @Column(name = "pro_id")
    private Integer proId;

    @Column(name = "pro_name")
    private String proName;

    private Double price;

    @Column(name = "cat_code")
    private String catCode;

    public Product() {
    }

    public Integer getProId() {
        return proId;
    }

    public String getProName() {
        return proName;
    }

    public Double getPrice() {
        return price;
    }

    public String getCatCode() {
        return catCode;
    }
}