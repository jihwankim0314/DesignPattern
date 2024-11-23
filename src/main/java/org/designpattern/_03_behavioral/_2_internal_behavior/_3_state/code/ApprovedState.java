package org.designpattern._03_behavioral._2_internal_behavior._3_state.code;

public class ApprovedState implements DocumentState {
    @Override
    public void handleRequest() {
        System.out.println("승인 상태 - 변경 불가 ");
    }
}
