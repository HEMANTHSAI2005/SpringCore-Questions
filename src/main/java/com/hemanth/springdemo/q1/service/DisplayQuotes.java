package com.hemanth.springdemo.q1.service;

import com.hemanth.springdemo.q1.quotes.Quotes;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DisplayQuotes {

    private final Quotes quotes;

    public DisplayQuotes(
            @Qualifier("friendshipQuotes")
            Quotes quotes) {

        this.quotes = quotes;
    }

    public void display() {

        System.out.println("\nDisplayQuotes:");

        for(String quote : quotes.getQuotes()) {

            System.out.println(quote);
        }
    }
}