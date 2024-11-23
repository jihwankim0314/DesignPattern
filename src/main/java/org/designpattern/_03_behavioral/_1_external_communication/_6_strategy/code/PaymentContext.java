package org.designpattern._03_behavioral._1_external_communication._6_strategy.code;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void changePaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
