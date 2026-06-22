package com.hemanth.springdemo.q1.service;

import com.hemanth.springdemo.q1.quotes.Quotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PrintQuotesSetter {

    private Quotes quotes;

    @Autowired
    @Qualifier("friendshipQuotes")
    public void setQuotes(Quotes quotes) {

        this.quotes = quotes;
    }

    public void printQuotes() {

        System.out.println("\nSetter Injection:");

        for(String quote : quotes.getQuotes()) {

            System.out.println(quote);
        }
    }
}