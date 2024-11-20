package org.designpattern._02_structural._1_one_to_one._2_bridge.code;

public class NormalMessage extends Message {
    public NormalMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        System.out.println("normal message");
        messageSender.sendMessage(message);
    }
}
