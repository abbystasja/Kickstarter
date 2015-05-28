package com.kickstarter.view;

import com.kickstarter.controller.Controller;
import com.kickstarter.controller.MainController;
import com.kickstarter.entities.Category;
import com.kickstarter.entities.Quote;

import java.util.*;

/**
 * Created by akulygina on 5/27/2015.
 */
public class IndexView extends View<MainController>{

    public IndexView(MainController controller) {
        super(controller);
    }

    @Override
    public void display(){
        System.out.println(controller.getQuote());
        System.out.println();

        List<Category> categories = controller.getCategoryList();

        for (int i = 0; i < categories.size(); i++) {
            System.out.println(i + 1 + " " + categories.get(i));
        }
    }

    @Override
    public int determineNextStep() {
        System.out.println("Please enter value between 1 and " + controller.getCategoryList().size() + " or 0 to Exit");
        return in.nextInt();
    }
}
