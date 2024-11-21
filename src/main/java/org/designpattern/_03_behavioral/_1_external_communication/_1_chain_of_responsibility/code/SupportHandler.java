package org.designpattern._03_behavioral._1_external_communication._1_chain_of_responsibility.code;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract String handleRequest(String request);
}
