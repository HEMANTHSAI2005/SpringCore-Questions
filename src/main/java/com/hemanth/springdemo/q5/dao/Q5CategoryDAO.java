package com.hemanth.springdemo.q5.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Q5CategoryDAO {

    private final JdbcTemplate jdbcTemplate;

    public Q5CategoryDAO(
            JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public int insertCategory(
            String code,
            String description) {

        String sql =
                """
                INSERT INTO Category
                VALUES (?,?)
                """;

        return jdbcTemplate.update(
                sql,
                code,
                description
        );
    }
}