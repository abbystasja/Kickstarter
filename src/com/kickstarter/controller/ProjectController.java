package com.kickstarter.controller;

import com.kickstarter.entities.Project;
import com.kickstarter.view.ProjectView;
import com.kickstarter.view.View;

/**
 * Created by akulygina on 5/28/2015.
 */
public class ProjectController extends Controller {

    private Project project;

    public ProjectController(Controller prevController, Project project) {
        super(prevController);
        this.project = project;
    }

    public ProjectController(Controller prevController) {
        super(prevController);
    }

    @Override
    public boolean outOfRange(int nextPosition) {
        return nextPosition == 0;
    }

    @Override
    public View getPage() {
        return new ProjectView(project);
    }

    @Override
    public Controller getNextController(int nextPosition) {
        return null;
    }
}
