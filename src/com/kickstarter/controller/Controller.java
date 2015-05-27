package com.kickstarter.controller;

import com.kickstarter.view.View;

/**
 * Created by akulygina on 5/27/2015.
 */
public abstract class Controller {
    protected View prevView;
    protected View currView;

    public Controller(View prevView) {
        this.prevView = prevView;
    }

    public View getPrevView() {
        return prevView;
    }

    public void process() {
        currView = getPage();
        currView.display();

        while (true) {
            int nextPosition = -1;
            do {
                nextPosition = currView.determineNextStep();
            } while (!outOfRange(nextPosition));

            if (nextPosition == 0) {
                getPrevView();
                return;
            }

            prevView = currView;
            currView = getNextPage(nextPosition);
        }
    }

    public abstract boolean outOfRange(int nextPosition);

    public abstract View getPage();

    public abstract View getNextPage(int nextPosition);

}
