package com.kickstarter.view;

import com.kickstarter.entities.Category;
import com.kickstarter.entities.Quote;
import com.kickstarter.repository.ModelsRepository;

import java.util.*;

/**
 * Created by akulygina on 5/27/2015.
 */
public class IndexView extends View{

    private List<Category> categories;
    private Quote quote;


    public IndexView(List<Category> categories, Quote quote){
        this.categories = categories;
        this.quote = quote;

    }

    @Override
    public void display(){
        System.out.println(quote);
        System.out.println();

        for (int i = 0; i < categories.size(); i++) {
            System.out.println(i + 1 + " " + categories.get(i));
        }
    }

    @Override
    public int determineNextStep() {
        System.out.println("Please enter value between 1 and " + categories.size() + " or 0 to Exit");
        return in.nextInt();
    }
}
