package lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.ConcreteFactory;

import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.AbstractFactory.GUIFactory;
import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product.*;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }
}
