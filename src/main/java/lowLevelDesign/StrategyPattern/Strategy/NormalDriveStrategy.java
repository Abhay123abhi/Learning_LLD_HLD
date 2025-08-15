package lowLevelDesign.StrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("Noraml drive strategy");
    }

}
