package com.kickstarter.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by akulygina on 5/27/2015.
 */
public class Project {
    private String name;
    private String shortDescription;

    private int neededMoney;
    private int collectedMoney;

    private Date endDate;

    private List<QuestionAndAnswer> questionAndAnswers;

    public Project(String name, String shortDescription, int neededMoney, int collectedMoney, Date endDate) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.neededMoney = neededMoney;
        this.collectedMoney = collectedMoney;
        this.endDate = endDate;
        questionAndAnswers = new ArrayList<QuestionAndAnswer>();
    }

    public void addQuestionAndAnswer(QuestionAndAnswer questionAndAnswer){
        questionAndAnswers.add(questionAndAnswer);
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public int getNeededMoney() {
        return neededMoney;
    }

    public int getCollectedMoney() {
        return collectedMoney;
    }

    public Date getEndDate() {
        return endDate;
    }

    private int calculateDaysLeft(){
        Date current = new Date();
        long difference = endDate.getTime() - current.getTime();
        return (int) difference/(1000 * 60 * 60 * 24);
    }

    public String getShortProjectDescription(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name ").append(name).append(" ").
                append("\tShort description ").append(shortDescription).append(" ").
                append("\tNeeded money ").append(neededMoney).append(" ").
                append("\tCollected money ").append(collectedMoney).append(" ").
                append("\tDays left ").append(calculateDaysLeft()).append(" ");
        return sb.toString();
    }

    public String getFullDescription(){
        StringBuilder sb = new StringBuilder();
        for(QuestionAndAnswer questionAndAnswer : questionAndAnswers){
            sb.append(questionAndAnswer);
        }
        return getShortProjectDescription() + "[" + sb.toString() + "]";
    }

    public void setCollectedMoney(int collectedMoney) {
        this.collectedMoney = collectedMoney;
    }
}
