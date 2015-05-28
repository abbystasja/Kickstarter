package com.kickstarter.view;

import com.kickstarter.entities.Project;

/**
 * Created by akulygina on 5/28/2015.
 */
public class ProjectView extends View {

    private Project project;

    public ProjectView(Project project){
        this.project = project;
    }

    @Override
    public void display() {
        System.out.println("Full information for your project");
        System.out.println(project.getFullDescription());
    }

    @Override
    public int determineNextStep() {
        System.out.println("Please enter 0 to go to all project in your catogory");
        return in.nextInt();
    }
}
