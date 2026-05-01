package lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Client;

import lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Creator.RoadLogistics;
import lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Creator.SeaLogistics;
import lowLevelDesign.DesignPatterns.CreationalPatterns.FactoryDesignPattern.Creator.*;

public class main {
    public static void main(String[] args) {
        Logistics logistics = getLogistics("SEA");
        logistics.planDelivery();
    }

    public static Logistics getLogistics(String type) {
        switch(type) {
            case "ROAD": return new RoadLogistics();
            case "SEA": return new SeaLogistics();
            default: throw new IllegalArgumentException();
        }
    }
}

// This switch-based factory violates Open/Closed Principle because
// adding a new type like AirLogistics requires modifying this method.
// A better approach is to rely on polymorphism and use dependency injection
// or configuration to decide which concrete implementation to use at runtime.
