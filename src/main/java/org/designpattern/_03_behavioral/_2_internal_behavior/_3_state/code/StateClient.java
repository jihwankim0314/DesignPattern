package org.designpattern._03_behavioral._2_internal_behavior._3_state.code;

public class StateClient {
    public static void main(String[] args) {
        Document document = new Document();

        // Draft 상태
        document.changeState(new DraftState());
        document.process();

        // Review 상태
        document.changeState(new ReviewState());
        document.process();

        // Approved 상태
        document.changeState(new ApprovedState());
        document.process();
    }
}
