package org.designpattern._03_behavioral._1_external_communication._6_strategy.code;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal (" + email + ").");
    }
}
