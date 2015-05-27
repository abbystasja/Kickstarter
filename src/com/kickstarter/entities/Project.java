package com.kickstarter.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by akulygina on 5/27/2015.
 */
public class Project {
    private String name;
    private String shortDescription;

    private int neededMoney;
    private int collectedMoney;

    private Date endDate;

    public Project(String name, String shortDescription, int neededMoney, int collectedMoney, Date endDate) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.neededMoney = neededMoney;
        this.collectedMoney = collectedMoney;
        this.endDate = endDate;
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
                append("Short description ").append(shortDescription).append(" ").
                append("Needed money ").append(neededMoney).append(" ").
                append("Collected money ").append(collectedMoney).append(" ").
                append("Days left ").append(calculateDaysLeft()).append(" ");
        return sb.toString();
    }
}
