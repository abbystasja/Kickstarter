package com.kickstarter.controller;

import com.kickstarter.entities.Payment;
import com.kickstarter.entities.Project;
import com.kickstarter.view.PaymentView;
import com.kickstarter.view.View;

/**
 * Created by akulygina on 5/28/2015.
 */
public class PaymentController extends Controller {

    Project project;

    public PaymentController(Controller prevController, Project project) {
        super(prevController);
        this.project = project;
    }

    @Override
    public boolean outOfRange(int nextPosition) {
        return nextPosition >= 0;
    }

    @Override
    public View getPage() {
        return new PaymentView(this);
    }

    @Override
    public Controller getNextController(int nextPosition) {
        return null;
    }

    public void donate(Payment payment){
        project.setCollectedMoney(project.getCollectedMoney() + payment.getDonation());
    }
}
