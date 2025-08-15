package lowLevelDesign.StrategyPattern;


import lowLevelDesign.StrategyPattern.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new NormalDriveStrategy());
    }
}
