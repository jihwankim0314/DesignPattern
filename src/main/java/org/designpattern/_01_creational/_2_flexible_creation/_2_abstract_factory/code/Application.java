package org.designpattern._01_creational._2_flexible_creation._2_abstract_factory.code;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        GUIFactory windowFactory = new WindowsFactory();
        Application windowApp = new Application(windowFactory);
        windowApp.render();


        GUIFactory macOsFactory = new MacOsGUIFactory();
        Application macOsApp = new Application(macOsFactory);
        macOsApp.render();
    }
}
