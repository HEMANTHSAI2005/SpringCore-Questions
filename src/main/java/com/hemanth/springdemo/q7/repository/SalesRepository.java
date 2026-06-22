package com.hemanth.springdemo.q7.repository;

import com.hemanth.springdemo.q7.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

public interface SalesRepository
        extends JpaRepository<Sales,Integer> {

    List<Sales> findByProductProId(
            Integer proId
    );

    List<Sales> findByQuantityBetween(
            Integer start,
            Integer end
    );

    @Query("""
           SELECT s
           FROM Sales s
           WHERE s.pricePerUnit < s.product.price
           """)
    List<Sales> findSalesBelowCurrentPrice();

    List<Sales> findAllByOrderByQuantityAsc();
}