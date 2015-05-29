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

    @Override
    public boolean outOfRange(int nextPosition) {
        return nextPosition >= 0 && nextPosition <= 2;
    }

    @Override
    public View getPage() {
        return new ProjectView(this);
    }

    @Override
    public Controller getNextController(int nextPosition) {
        if (nextPosition == 1) {
            return new PaymentController(this, project);
        } else {
            return new QuestionAndAnswerController(this, project);
        }
    }

    public Project getProject() {
        return project;
    }
}
