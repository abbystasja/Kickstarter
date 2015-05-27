package com.kickstarter.view;

import com.kickstarter.entities.Category;
import com.kickstarter.entities.Quote;
import com.kickstarter.model.CategoryModel;
import com.kickstarter.model.QuoteModel;
import com.kickstarter.repository.ModelsRepository;
import com.sun.javafx.sg.PGShape;

/**
 * Created by akulygina on 5/27/2015.
 */
public class IndexView {

    private CategoryModel categoryModel;

    public IndexView() {
        categoryModel = ModelsRepository.getCategoryModelInstance();
    }

    public void display(){
        System.out.println(ModelsRepository.getQuotesModelInstance().getRandomQuote());

        System.out.println();

        for (int i = 0; i < categoryModel.getCategories().size(); i++) {
            System.out.println(i + 1 + " " + categoryModel.getCategories().get(i));
        }

    }

    public static void main(String[] args) {
        //initing of quotesModel
        ModelsRepository.getQuotesModelInstance().addQuote(new Quote("\"After all is said and done, more is said than done.\""));
        ModelsRepository.getQuotesModelInstance().addQuote(new Quote("\"The worst solitude is to be destitute of sincere friendship.\""));
        ModelsRepository.getQuotesModelInstance().addQuote(new Quote("\"Never make fun of someone who speaks broken English. It means they know another language.\""));

        ModelsRepository.getCategoryModelInstance().addCategory(new Category("Music"));
        ModelsRepository.getCategoryModelInstance().addCategory(new Category("IT project"));
        ModelsRepository.getCategoryModelInstance().addCategory(new Category("Comics"));

        IndexView indexView = new IndexView();
        indexView.display();
    }
}
