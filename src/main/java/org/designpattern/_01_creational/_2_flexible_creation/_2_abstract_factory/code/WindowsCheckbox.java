package org.designpattern._01_creational._2_flexible_creation._2_abstract_factory.code;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("윈도우 체크박스 렌더링");
    }
}
