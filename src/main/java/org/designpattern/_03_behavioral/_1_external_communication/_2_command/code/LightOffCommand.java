package org.designpattern._03_behavioral._1_external_communication._2_command.code;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
