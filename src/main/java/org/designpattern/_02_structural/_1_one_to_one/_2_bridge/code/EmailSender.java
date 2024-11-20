package org.designpattern._02_structural._1_one_to_one._2_bridge.code;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("sending Email:"+ message);
    }
}
