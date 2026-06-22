package com.hemanth.springdemo.q6.runner;

import com.hemanth.springdemo.q6.dao.Q6ProductDAO;
import com.hemanth.springdemo.q6.model.ProductCategory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Q6Runner
        implements CommandLineRunner {

    private final Q6ProductDAO dao;

    public Q6Runner(
            Q6ProductDAO dao) {

        this.dao = dao;
    }

    @Override
    public void run(String... args) {

        for(ProductCategory p :
                dao.getProducts(1000)) {

            System.out.println(
                    p.getProductName()
                    + " -> "
                    + p.getCategoryDescription()
            );
        }
    }
}