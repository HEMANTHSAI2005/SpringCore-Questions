package com.hemanth.springdemo.q1.quotes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FriendshipQuotes implements Quotes {

    @Override
    public String[] getQuotes() {

        return new String[] {

                "A friend in need is a friend indeed",

                "Friendship doubles joy",

                "True friends stay forever"
        };
    }
}