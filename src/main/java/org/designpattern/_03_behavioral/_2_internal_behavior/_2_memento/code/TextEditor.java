package org.designpattern._03_behavioral._2_internal_behavior._2_memento.code;

// Originator
public class TextEditor {
    private String text = "";

    public void write(String newText) {
        text += newText;
    }

    public String getText() {
        return text;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(text);
    }

    public void restore(TextEditorMemento memento) {
        this.text = memento.getText();
    }
}
