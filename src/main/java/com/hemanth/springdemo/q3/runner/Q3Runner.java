package com.hemanth.springdemo.q3.runner;

import com.hemanth.springdemo.q3.dao.Q3ProductDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Q3Runner
        implements CommandLineRunner {

    private final Q3ProductDAO productDAO;

    public Q3Runner(
            Q3ProductDAO productDAO) {

        this.productDAO = productDAO;
    }

    @Override
    public void run(String... args) {

        Double avgPrice =
                productDAO.getAveragePrice();

        System.out.println(
                "\nAverage Price = "
                + avgPrice
        );
    }
}