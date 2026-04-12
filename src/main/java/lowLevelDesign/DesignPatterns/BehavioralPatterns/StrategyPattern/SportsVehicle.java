package lowLevelDesign.DesignPatterns.BehavioralPatterns.StrategyPattern;

import lowLevelDesign.DesignPatterns.BehavioralPatterns.StrategyPattern.Strategy.DriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
