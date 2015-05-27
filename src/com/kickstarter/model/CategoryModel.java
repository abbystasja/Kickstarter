package com.kickstarter.model;

import com.kickstarter.entities.Category;
import com.kickstarter.entities.Quote;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by akulygina on 5/27/2015.
 */
public class CategoryModel {
    private List<Category> categories;

    public CategoryModel(){
        categories = new ArrayList<Category>();
    }

    public void addCategory(Category category){
        categories.add(category);
    }

    public List<Category> getCategories(){
        return categories;
    }

}
