package com.hemanth.springdemo.q4.runner;

import com.hemanth.springdemo.q4.dao.Q4ProductDAO;
import com.hemanth.springdemo.q4.model.CategoryAverage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Q4Runner
        implements CommandLineRunner {

    private final Q4ProductDAO productDAO;

    public Q4Runner(
            Q4ProductDAO productDAO) {

        this.productDAO = productDAO;
    }

    @Override
    public void run(String... args) {

        for(CategoryAverage c :
                productDAO.getCategoryAverage()) {

            System.out.println(
                    c.getCatCode()
                    + " -> "
                    + c.getAvgPrice()
            );
        }
    }
}