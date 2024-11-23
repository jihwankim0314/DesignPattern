package org.designpattern._03_behavioral._1_external_communication._4_mediator.code;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
