package org.designpattern._03_behavioral._1_external_communication._2_command.code;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
