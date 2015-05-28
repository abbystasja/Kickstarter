package com.kickstarter.controller;

import com.kickstarter.view.View;

/**
 * Created by akulygina on 5/28/2015.
 */
public class QuestionAndAnswerController extends Controller {

    public QuestionAndAnswerController(Controller prevController) {
        super(prevController);
    }

    @Override
    public boolean outOfRange(int nextPosition) {
        return nextPosition == 0;
    }

    @Override
    public View getPage() {
        return null;
    }

    @Override
    public Controller getNextController(int nextPosition) {
        return null;
    }
}
