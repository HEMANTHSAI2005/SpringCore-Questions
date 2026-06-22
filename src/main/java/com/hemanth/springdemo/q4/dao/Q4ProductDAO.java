package com.hemanth.springdemo.q4.dao;

import com.hemanth.springdemo.q4.model.CategoryAverage;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Q4ProductDAO {

    private final JdbcTemplate jdbcTemplate;

    public Q4ProductDAO(
            JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public List<CategoryAverage>
    getCategoryAverage() {

        String sql =
                """
                SELECT cat_code,
                       AVG(price) AS avgprice
                FROM Product
                GROUP BY cat_code
                """;

        return jdbcTemplate.query(
                sql,
                (rs,rowNum) ->
                        new CategoryAverage(
                                rs.getString("cat_code"),
                                rs.getDouble("avgprice")
                        )
        );
    }
}