package org.designpattern._03_behavioral._2_internal_behavior._2_memento.code;

public class TextEditorMemento {
    private final String text;

    public TextEditorMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
