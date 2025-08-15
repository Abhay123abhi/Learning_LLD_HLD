package lowLevelDesign.StrategyPattern;

import lowLevelDesign.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
