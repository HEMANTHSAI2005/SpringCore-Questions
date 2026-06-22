package com.hemanth.springdemo;

import com.hemanth.springdemo.q1.service.DisplayQuotes;
import com.hemanth.springdemo.q1.service.PrintQuotesConstructor;
import com.hemanth.springdemo.q1.service.PrintQuotesField;
import com.hemanth.springdemo.q1.service.PrintQuotesSetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication { 

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(
                        SpringDemoApplication.class,
                        args
                );

        context.getBean(
                PrintQuotesConstructor.class
        ).printQuotes();

        context.getBean(
                PrintQuotesSetter.class
        ).printQuotes();

        context.getBean(
                PrintQuotesField.class
        ).printQuotes();

        context.getBean(
                DisplayQuotes.class
        ).display();

        context.close();		
    }
}