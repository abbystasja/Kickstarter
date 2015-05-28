package com.kickstarter.view;

import com.kickstarter.controller.CategoriesController;
import com.kickstarter.controller.Controller;
import com.kickstarter.entities.Project;

import java.util.List;

/**
 * Created by akulygina on 5/27/2015.
 */
public class CategoriesView extends View<CategoriesController>{

    public CategoriesView(CategoriesController controller) {
        super(controller);
    }

    @Override
    public void display() {
        List<Project>  projectList = controller.getProjectList();
        for (int i = 0; i < projectList.size(); i++) {
            System.out.println(i + 1 + " " + projectList.get(i).getShortProjectDescription());
        }
    }

    @Override
    public int determineNextStep() {
        System.out.println("Please enter value between 1 and " + controller.getProjectList().size() + " or 0 to go to categories view");
        return in.nextInt();
    }
}
