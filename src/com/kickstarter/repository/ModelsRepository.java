package com.kickstarter.repository;

import com.kickstarter.model.CategoryModel;
import com.kickstarter.model.QuoteModel;

/**
 * Created by akulygina on 5/27/2015.
 */
public class ModelsRepository {
    private static QuoteModel quoteModel;
    private static CategoryModel categoryModel;

    public static QuoteModel getQuotesModelInstance(){
        if(quoteModel == null) {
            quoteModel = new QuoteModel();
        }
        return quoteModel;
    }

    public static CategoryModel getCategoryModelInstance(){
        if(categoryModel == null) {
            categoryModel = new CategoryModel();
        }
        return categoryModel;
    }

}
