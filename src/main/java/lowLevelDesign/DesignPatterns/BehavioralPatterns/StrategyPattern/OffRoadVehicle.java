package lowLevelDesign.DesignPatterns.BehavioralPatterns.StrategyPattern;


import lowLevelDesign.DesignPatterns.BehavioralPatterns.StrategyPattern.Strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
