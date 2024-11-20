package org.designpattern._01_creational._2_flexible_creation._2_abstract_factory.code;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("맥 OS 체크박스 ");
    }
}
