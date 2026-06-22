package com.hemanth.springdemo.q6.dao;

import com.hemanth.springdemo.q6.model.ProductCategory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Q6ProductDAO {

    private final JdbcTemplate jdbcTemplate;

    public Q6ProductDAO(
            JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ProductCategory>
    getProducts(double price) {

        String sql =
                """
                SELECT
                    p.pro_name,
                    c.cat_desc
                FROM Product p
                JOIN Category c
                ON p.cat_code = c.cat_code
                WHERE LEN(p.pro_name) < 10
                AND p.price > ?
                """;

        return jdbcTemplate.query(
                sql,
                (rs,rowNum) ->
                        new ProductCategory(
                                rs.getString("pro_name"),
                                rs.getString("cat_desc")
                        ),
                price
        );
    }
}