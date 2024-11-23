package org.designpattern._03_behavioral._1_external_communication._6_strategy.code;

public class StrategyClient {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.changePaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(100);

        context.changePaymentStrategy(new PayPalPayment("user@example.com"));
        context.executePayment(200);
    }
}
