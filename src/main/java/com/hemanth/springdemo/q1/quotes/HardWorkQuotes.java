package com.hemanth.springdemo.q1.quotes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class HardWorkQuotes implements Quotes {

    @PostConstruct
    public void init() {

        System.out.println(
                "HardWorkQuotes Bean Created"
        );
    }

    @PreDestroy
    public void destroy() {

        System.out.println(
                "HardWorkQuotes Bean Destroyed"
        );
    }

    @Override
    public String[] getQuotes() {

        return new String[] {

                "Hard work beats talent",

                "Success comes from effort",

                "Work until you succeed",

                "Dream big and work hard"
        };
    }
}