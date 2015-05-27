package com.kickstarter.model;

import com.kickstarter.entities.Quote;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by akulygina on 5/27/2015.
 */
public class QuoteModel {
    private List<Quote> quotes;

    public QuoteModel(){
        quotes = new ArrayList<Quote>();
    }

    public void addQuote(Quote quote){
        quotes.add(quote);
    }

    public Quote getRandomQuote(){
        return quotes.get(new Random().nextInt(quotes.size()));
    }
}
