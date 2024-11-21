package org.designpattern._03_behavioral._1_external_communication._2_command.code;

public class Client {
    public static void main(String[] args) {
        Light light = new Light(); // Receiver

        RemoteControl remote = new RemoteControl(); // Invoker

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        remote.setCommand(lightOff);
        remote.pressButton();
        remote.pressUndo();

        remote.setCommand(lightOn);
        remote.pressButton();
        remote.pressUndo();
    }
}
