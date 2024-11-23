package org.designpattern._03_behavioral._1_external_communication._4_mediator.code;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void receive(String message);
    public abstract void send(String message);
}
