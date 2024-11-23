package org.designpattern._03_behavioral._1_external_communication._1_chain_of_responsibility.code;

public class TechnicalHandler extends SupportHandler {
    @Override
    public String handleRequest(String request) {
        if (request.equals("Technical")) {
            return "TechnicalHandler 가 처리";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(request);
        } else {
            return "TechnicalHandler: 처리 불가, 다음 처리자 없음.";
        }
    }
}
