package com.kickstarter.view;

import java.util.Scanner;

/**
 * Created by akulygina on 5/27/2015.
 */
public abstract class View {

    protected Scanner in;

    public View(){
        in = new Scanner(System.in);
    }

    public abstract void display();

    public abstract int determineNextStep();

}
