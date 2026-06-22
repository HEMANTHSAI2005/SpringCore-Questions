package com.hemanth.springdemo.q6.model;

public class ProductCategory {

    private String productName;
    private String categoryDescription;

    public ProductCategory(
            String productName,
            String categoryDescription) {

        this.productName = productName;
        this.categoryDescription = categoryDescription;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }
}