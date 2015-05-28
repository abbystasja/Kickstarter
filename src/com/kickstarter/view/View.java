package com.kickstarter.view;

import com.kickstarter.controller.Controller;

import java.util.Scanner;

/**
 * Created by akulygina on 5/27/2015.
 */
public abstract class View<T extends Controller> {

    protected Scanner in;
    protected T controller;

    public View(T controller){
        this.controller = controller;
        in = new Scanner(System.in);
    }

    public abstract void display();

    public abstract int determineNextStep();

}
