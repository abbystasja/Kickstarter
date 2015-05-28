package com.kickstarter.entities;

/**
 * Created by akulygina on 5/28/2015.
 */
public class Payment {
    private String cardHolder;
    private String cardNumber;
    private String cvv2;
    private int donation;

    public Payment(String cardHolder, String cardNumber, String cvv2, int donation) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.cvv2 = cvv2;
        this.donation = donation;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv2() {
        return cvv2;
    }

    public int getDonation() {
        return donation;
    }
}
