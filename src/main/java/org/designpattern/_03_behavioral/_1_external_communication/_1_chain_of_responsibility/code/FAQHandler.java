package org.designpattern._03_behavioral._1_external_communication._1_chain_of_responsibility.code;

public class FAQHandler extends SupportHandler {
    @Override
    public String handleRequest(String request) {
        if (request.equals("FAQ")) {
            return "FAQ Handler 에 맞는 요청 들어옴";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(request);
        } else {
            return "FAQHandler 가 처리 불가, 다음 handler 없음";
        }
    }
}
