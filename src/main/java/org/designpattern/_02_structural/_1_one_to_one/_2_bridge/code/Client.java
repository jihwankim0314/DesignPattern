package org.designpattern._02_structural._1_one_to_one._2_bridge.code;

public class Client {
    public static void main(String[] args) {
        MessageSender messageSender = new EmailSender();
        Message normalMessage = new NormalMessage(messageSender);

        normalMessage.send("message1");

        MessageSender smsSender = new SmsSender();
        Message urgentMessage = new UrgentMessage(smsSender);

        urgentMessage.send("message2");
    }
}
