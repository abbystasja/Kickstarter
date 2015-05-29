package com.kickstarter.controller;

import com.kickstarter.entities.Project;
import com.kickstarter.entities.QuestionAndAnswer;
import com.kickstarter.repository.ModelsRepository;
import com.kickstarter.view.QuestionAndAnswerView;
import com.kickstarter.view.View;

/**
 * Created by akulygina on 5/28/2015.
 */
public class QuestionAndAnswerController extends Controller {

    private Project project;

    public QuestionAndAnswerController(Controller prevController, Project project) {
        super(prevController);
        this.project = project;
    }

    @Override
    public boolean outOfRange(int nextPosition) {
        return nextPosition == 0;
    }

    @Override
    public View getPage() {
        return new QuestionAndAnswerView(this);
    }

    @Override
    public Controller getNextController(int nextPosition) {
        return null;
    }

    public void addQuestionAndAnswer(QuestionAndAnswer questionAndAnswer){
        project.addQuestionAndAnswer(questionAndAnswer);
    }
}
