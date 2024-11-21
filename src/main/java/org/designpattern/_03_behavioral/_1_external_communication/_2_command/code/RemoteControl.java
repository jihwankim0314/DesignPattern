package org.designpattern._03_behavioral._1_external_communication._2_command.code;


// Invoker
public class RemoteControl {
    private Command command;

    public void setCommand (Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.excute();
    }

    public void pressUndo() {
        command.undo();
    }
}
