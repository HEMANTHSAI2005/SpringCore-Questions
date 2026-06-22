package com.hemanth.springdemo.q5.runner;

import com.hemanth.springdemo.q5.dao.Q5CategoryDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// @Component
public class Q5Runner
        implements CommandLineRunner {

    private final Q5CategoryDAO dao;

    public Q5Runner(
            Q5CategoryDAO dao) {

        this.dao = dao;
    }

    @Override
    public void run(String... args) {

        int rows =
                dao.insertCategory(
                        "C3",
                        "Computer Parts"
                );

        System.out.println(
                "Rows Inserted = "
                + rows
        );
    }
}