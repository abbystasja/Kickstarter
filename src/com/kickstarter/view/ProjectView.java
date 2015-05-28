package com.kickstarter.view;

import com.kickstarter.controller.Controller;
import com.kickstarter.controller.ProjectController;
import com.kickstarter.entities.Project;

/**
 * Created by akulygina on 5/28/2015.
 */
public class ProjectView extends View<ProjectController> {

    public ProjectView(ProjectController controller) {
        super(controller);
    }

    @Override
    public void display() {
        System.out.println("Full information for your project");
        System.out.println(controller.getProject().getFullDescription());
    }

    @Override
    public int determineNextStep() {
        System.out.println("Please 1 to donate the project 2 to ask a question or enter 0 to go to all project in your catogory");
        return in.nextInt();
    }
}
