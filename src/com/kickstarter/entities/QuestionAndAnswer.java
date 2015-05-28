package com.kickstarter.entities;

/**
 * Created by akulygina on 5/28/2015.
 */
public class QuestionAndAnswer {
    private String question;
    private String answer;


    public QuestionAndAnswer(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "QuestionAndAnswer{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
