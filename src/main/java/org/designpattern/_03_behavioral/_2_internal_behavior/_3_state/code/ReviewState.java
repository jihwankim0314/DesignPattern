package org.designpattern._03_behavioral._2_internal_behavior._3_state.code;

public class ReviewState implements DocumentState {
    @Override
    public void handleRequest() {
        System.out.println("리뷰 상태 - 편집 불가 ");
    }
}
