package org.designpattern._03_behavioral._1_external_communication._1_chain_of_responsibility.code;

public class ChainHandlerClient {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();

        // 체인에 핸들러 추가
        handlerChain.addHandler(new FAQHandler());
        handlerChain.addHandler(new PaymentHandler());
        handlerChain.addHandler(new TechnicalHandler());

        handlerChain.handleRequest("request입니다~!");
    }
}
