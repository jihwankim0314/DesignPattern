package org.designpattern._02_structural._1_one_to_one._2_bridge.code;

public abstract class Message {
    protected MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send(String message);
}
