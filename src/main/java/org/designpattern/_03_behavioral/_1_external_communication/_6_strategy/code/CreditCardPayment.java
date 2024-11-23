package org.designpattern._03_behavioral._1_external_communication._6_strategy.code;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card (" + cardNumber + ").");
    }
}
