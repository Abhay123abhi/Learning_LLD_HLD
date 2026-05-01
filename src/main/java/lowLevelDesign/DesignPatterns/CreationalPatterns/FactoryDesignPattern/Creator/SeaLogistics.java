package lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Creator;

import lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Product.Ship;
import lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Product.Transport;

public class SeaLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
