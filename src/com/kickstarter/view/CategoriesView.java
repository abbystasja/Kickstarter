package com.kickstarter.view;

import com.kickstarter.entities.Project;

import java.util.List;

/**
 * Created by akulygina on 5/27/2015.
 */
public class CategoriesView extends View{

    private List<Project> projectList;

    public CategoriesView(List<Project> projectList){
        this.projectList = projectList;
    }

    @Override
    public void display() {
        for (int i = 0; i < projectList.size(); i++) {
            System.out.println(i + 1 + " " + projectList.get(i).getShortProjectDescription());
        }
    }

    @Override
    public int determineNextStep() {
        System.out.println("Please enter value between 1 and " + projectList.size() + " or 0 to go to categories view");
        return in.nextInt();
    }
}
