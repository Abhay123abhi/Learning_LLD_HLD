package lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.ConcreteFactory;

import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.AbstractFactory.GUIFactory;
import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product.Button;
import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product.Checkbox;
import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product.WinButton;
import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product.WinCheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WinCheckbox();
    }
}
