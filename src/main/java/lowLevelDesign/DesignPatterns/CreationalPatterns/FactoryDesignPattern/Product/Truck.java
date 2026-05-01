package lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Product;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver by Truck!");
    }
}
