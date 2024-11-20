package org.designpattern._01_creational._2_flexible_creation._2_abstract_factory.code;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("윈도우 버튼 렌더링 ");
    }
}
