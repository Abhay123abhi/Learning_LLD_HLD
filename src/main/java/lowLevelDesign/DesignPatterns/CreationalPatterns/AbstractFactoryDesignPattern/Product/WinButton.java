package lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product;

public class WinButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
