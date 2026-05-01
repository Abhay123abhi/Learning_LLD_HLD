package lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product;

public class WinCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows Checkbox");
    }
}
