package org.designpattern._03_behavioral._2_internal_behavior._3_state.code;

// Context
public class Document {
    private DocumentState state;

    public void process() {
        state.handleRequest();
    }

    public void changeState(DocumentState state) {
        this.state = state;
    }
}
