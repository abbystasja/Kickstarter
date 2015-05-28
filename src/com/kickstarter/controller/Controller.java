package com.kickstarter.controller;

import com.kickstarter.view.View;

/**
 * Created by akulygina on 5/27/2015.
 */
public abstract class Controller {

    protected Controller prevController;
    protected View currView;

    public Controller(Controller prevController) {
        this.prevController = prevController;
    }

    public Controller getPrevController() {
        return prevController;
    }

    public Controller process() {
        currView = getPage();
        currView.display();

        int nextPosition = -1;

        do {
            nextPosition = currView.determineNextStep();
        } while (!outOfRange(nextPosition));

        if (nextPosition == 0) {
            return getPrevController();
        }

        return getNextController(nextPosition);
    }

    public abstract boolean outOfRange(int nextPosition);

    public abstract View getPage();

    public abstract Controller getNextController(int nextPosition);

}
