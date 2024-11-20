package org.designpattern._02_structural._1_one_to_one._2_bridge.code;

public class UrgentMessage extends Message {
    public UrgentMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        System.out.println("Urgent Message: ");
        messageSender.sendMessage(message);
    }
}
