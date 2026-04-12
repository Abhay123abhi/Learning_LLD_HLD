package lowLevelDesign.DesignPatterns.BehavioralPatterns.StrategyPattern;

import lowLevelDesign.DesignPatterns.BehavioralPatterns.StrategyPattern.Strategy.NormalDriveStrategy;
import lowLevelDesign.DesignPatterns.BehavioralPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle= new GoodsVehical(new NormalDriveStrategy());
        vehicle.drive();

        Vehicle vehicle1 = new SportsVehicle(new SportsDriveStrategy());
        vehicle1.drive();
    }
}
