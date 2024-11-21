package org.designpattern._03_behavioral._1_external_communication._1_chain_of_responsibility.code;

public class PaymentHandler extends SupportHandler {
    @Override
    public String handleRequest(String request) {
        if (request.equals("Payment")) {
            return "Payment Handler 가 처리함";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(request);
        } else {
            return "PaymentHandler: 처리 불가, 다음 Handler 없음";
        }
    }
}
