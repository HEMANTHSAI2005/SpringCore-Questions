package com.hemanth.springdemo.q2.runner;

import com.hemanth.springdemo.q2.component.Payment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Q2Runner
        implements CommandLineRunner {

    private final Payment payment;

    public Q2Runner(
            Payment payment) {

        this.payment = payment;
    }

    @Override
    public void run(String... args) {

        payment.payment();

        payment.validateCC();

        String result =
                payment.process();

        System.out.println(
                "Returned Value : "
                + result
        );
    }
}