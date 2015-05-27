package com.kickstarter.controller;

import com.kickstarter.entities.Category;
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

    public MainController(View prevView) {
        super(prevView);
        categoryList = new ArrayList<Category>();
        categoryList.addAll(ModelsRepository.getCategoryModelInstance().getCategories());
    }

    @Override
    public boolean outOfRange(int nextPosition) {
        return nextPosition >=0 && nextPosition <= categoryList.size();
    }

    @Override
    public View getPage() {
        return new IndexView(categoryList,
                ModelsRepository.getQuotesModelInstance().getRandomQuote());
    }

    @Override
    public View getNextPage(int nextPosition) {
        return null;
    }

}
