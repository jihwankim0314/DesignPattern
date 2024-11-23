package org.designpattern._03_behavioral._1_external_communication._1_chain_of_responsibility.code;

// 없어도 되지만, 있는게 체인 관리에 좋을듯?
public class HandlerChain {
    private SupportHandler firstHandler;

    public void addHandler(SupportHandler nextHandler) {
        if (firstHandler == null) {
            firstHandler = nextHandler;
        } else {
            SupportHandler current = firstHandler;
            while (current.nextHandler != null) {
                current = firstHandler.nextHandler;
            }

            current.setNextHandler(nextHandler);
        }
    }

    public String handleRequest(String request) {
        if (firstHandler != null) {
            return firstHandler.handleRequest(request);
        }

        return "처리할 수 있는 handler 가 없습니다.";
    }
}
