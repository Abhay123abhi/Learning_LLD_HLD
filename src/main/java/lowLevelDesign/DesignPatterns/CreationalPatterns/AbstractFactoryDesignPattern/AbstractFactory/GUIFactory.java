package lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.AbstractFactory;

import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product.Button;
import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
