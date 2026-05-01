package lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product;

public class MacCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Mac Checkbox");
    }
}
