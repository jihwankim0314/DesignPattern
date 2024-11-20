package org.designpattern._01_creational._2_flexible_creation._2_abstract_factory.code;

public class MacOsButton implements Button {
    @Override
    public void render() {
        System.out.println("맥 OS 버튼 렌더링");
    }
}
