package com.hemanth.springdemo.q1.service;

import com.hemanth.springdemo.q1.quotes.Quotes;
import org.springframework.stereotype.Component;

@Component
public class PrintQuotesConstructor {

    private Quotes quotes;

    public PrintQuotesConstructor(Quotes quotes) 
    {
        this.quotes = quotes;
    }

    public void printQuotes() 
    {

        for(String quote : quotes.getQuotes()) {

            System.out.println(quote);
        }
    }
}