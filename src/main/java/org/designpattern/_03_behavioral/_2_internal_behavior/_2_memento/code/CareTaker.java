package org.designpattern._03_behavioral._2_internal_behavior._2_memento.code;

import java.util.Stack;

// Caretaker
public class CareTaker {
    public Stack<TextEditorMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.empty()) {
            editor.restore(history.pop());
        } else {
            System.out.println("이전 기록이 없음");
        }
    }
}
