package lowLevelDesign.StrategyPattern;

import lowLevelDesign.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    public DriveStrategy driveObj;

    Vehicle(DriveStrategy driveObj){
        this.driveObj=driveObj;
    }
    public void drive(){
        driveObj.drive();
    }
}
