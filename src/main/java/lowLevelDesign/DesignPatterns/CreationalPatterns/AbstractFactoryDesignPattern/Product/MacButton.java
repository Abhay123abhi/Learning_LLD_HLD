package lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac Button");
    }
}
