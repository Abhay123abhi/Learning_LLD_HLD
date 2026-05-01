package lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Creator;

import lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Product.Truck;
import lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Product.Transport;

public class RoadLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
