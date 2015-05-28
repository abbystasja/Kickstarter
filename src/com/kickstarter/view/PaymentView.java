package com.kickstarter.view;

import com.kickstarter.controller.PaymentController;
import com.kickstarter.entities.Payment;

/**
 * Created by akulygina on 5/28/2015.
 */
public class PaymentView extends View<PaymentController> {

    Payment payment;

    public PaymentView(PaymentController controller) {
        super(controller);
    }

    @Override
    public void display() {
        System.out.println("Enter your name");
        String cardHolder = in.nextLine();
        System.out.println("Enter your cards numbers");
        String cardNumber = in.nextLine();
        System.out.println("Enter your cvv2");
        String cvv2 = in.nextLine();
        System.out.println("Enter amount of money you would lke to donate");
        int donation = in.nextInt();

        payment = new Payment(cardHolder, cardNumber, cvv2, donation);

    }

    @Override
    public int determineNextStep() {
        System.out.println("Your donation was successfull. Please enter 0 to go to project");
        controller.donate(payment);
        return in.nextInt();
    }
}
