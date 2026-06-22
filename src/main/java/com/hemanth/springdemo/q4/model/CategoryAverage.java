package com.hemanth.springdemo.q4.model;

public class CategoryAverage {

    private String catCode;
    private Double avgPrice;

    public CategoryAverage(
            String catCode,
            Double avgPrice) {

        this.catCode = catCode;
        this.avgPrice = avgPrice;
    }

    public String getCatCode() {
        return catCode;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }
}