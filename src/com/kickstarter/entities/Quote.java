package com.kickstarter.entities;

/**
 * Created by akulygina on 5/27/2015.
 */
public class Quote {
    private String quote;

    public Quote(String quote){
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return quote;
    }
}
