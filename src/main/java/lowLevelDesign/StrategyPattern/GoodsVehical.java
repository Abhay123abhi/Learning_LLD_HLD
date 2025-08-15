package lowLevelDesign.StrategyPattern;


import lowLevelDesign.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehical extends Vehicle{
    GoodsVehical(){
        super(new NormalDriveStrategy());
    }

}
