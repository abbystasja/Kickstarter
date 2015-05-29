package com.kickstarter.view;

import com.kickstarter.controller.QuestionAndAnswerController;
import com.kickstarter.entities.Payment;
import com.kickstarter.entities.QuestionAndAnswer;

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

        controller.addQuestionAndAnswer(new QuestionAndAnswer(question));
    }

    @Override
    public int determineNextStep() {
        System.out.println("Please enter 0 to go to your project");
        return in.nextInt();
    }
}
