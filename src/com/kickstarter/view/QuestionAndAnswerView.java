package com.kickstarter.view;

import com.kickstarter.controller.QuestionAndAnswerController;
import com.kickstarter.entities.Payment;

/**
 * Created by akulygina on 5/28/2015.
 */
public class QuestionAndAnswerView extends View<QuestionAndAnswerController> {

    public QuestionAndAnswerView(QuestionAndAnswerController controller) {
        super(controller);
    }

    @Override
    public void display() {
        System.out.println("Enter your question");
        String question = in.nextLine();


    }

    @Override
    public int determineNextStep() {
        return 0;
    }
}
