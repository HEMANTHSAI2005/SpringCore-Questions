package com.hemanth.springdemo.q1.service;

import com.hemanth.springdemo.q1.quotes.Quotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PrintQuotesField {

    @Autowired
    @Qualifier("hardWorkQuotes")
    private Quotes quotes;

    public void printQuotes() {

        System.out.println("\nField Injection:");

        for(String quote : quotes.getQuotes()) {

            System.out.println(quote);
        }
    }
}