package com.hemanth.springdemo.q3.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Q3ProductDAO {

    private final JdbcTemplate jdbcTemplate;

    public Q3ProductDAO(
            JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public Double getAveragePrice() {

        String sql =
                "SELECT AVG(price) FROM Product";

        return jdbcTemplate.queryForObject(
                sql,
                Double.class
        );
    }
}