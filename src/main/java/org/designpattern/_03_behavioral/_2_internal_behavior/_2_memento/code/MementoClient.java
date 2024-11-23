package org.designpattern._03_behavioral._2_internal_behavior._2_memento.code;

public class MementoClient {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker();

        editor.write("Hello, ");
        caretaker.save(editor);

        editor.write("world!");
        caretaker.save(editor);

        System.out.println("Current text: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After another undo: " + editor.getText());
    }
}
