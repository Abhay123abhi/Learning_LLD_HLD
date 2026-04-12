package lowLevelDesign.DesignPatterns.BehavioralPatterns.StrategyPattern;


import lowLevelDesign.DesignPatterns.BehavioralPatterns.StrategyPattern.Strategy.DriveStrategy;

public class GoodsVehical extends Vehicle{
    GoodsVehical(DriveStrategy driveStrategy){
        super(driveStrategy);
    }

}
