package org.designpattern._03_behavioral._2_internal_behavior._3_state.code;

// State
public interface DocumentState {
    // 필요 시 Context 를 파라미터로
    void handleRequest();
}
