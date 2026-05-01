package lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Creator;

import lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Product.Transport;

public abstract class  Logistics {
    abstract Transport createTransport();

    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }
}
