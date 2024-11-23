package org.designpattern._03_behavioral._2_internal_behavior._3_state.code;

public class DraftState implements DocumentState {
    @Override
    public void handleRequest() {
        System.out.println("편집 가능한 상태 ");
    }
}
