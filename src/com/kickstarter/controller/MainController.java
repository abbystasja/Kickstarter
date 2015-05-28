package com.kickstarter.controller;

import com.kickstarter.entities.Category;
import com.kickstarter.entities.Quote;
import com.kickstarter.repository.ModelsRepository;
import com.kickstarter.view.IndexView;
import com.kickstarter.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akulygina on 5/27/2015.
 */
public class MainController extends Controller{
    List<Category> categoryList;

    public MainController(Controller prevController) {
        super(null);
        categoryList = new ArrayList<Category>();
        categoryList.addAll(ModelsRepository.getCategoryModelInstance().getCategories());
    }

    @Override
    public boolean outOfRange(int nextPosition) {
        return nextPosition >=0 && nextPosition <= categoryList.size();
    }

    @Override
    public View getPage() {
        return new IndexView(this);
    }

    @Override
    public Controller getNextController(int nextPosition) {
        return new CategoriesController(this, categoryList.get(nextPosition-1));
    }

    public List<Category> getCategoryList(){
        return categoryList;
    }

    public Quote getQuote(){
        return ModelsRepository.getQuotesModelInstance().getRandomQuote();
    }


}
