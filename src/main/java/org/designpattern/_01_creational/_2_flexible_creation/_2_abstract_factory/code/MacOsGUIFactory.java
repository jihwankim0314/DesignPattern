package org.designpattern._01_creational._2_flexible_creation._2_abstract_factory.code;

public class MacOsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
