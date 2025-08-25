package lowLevelDesign.DesignPattern.BehavioralPatterns.NullObjectDesignPattern;

public class Car implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSettingCapacity() {
        return 6;
    }
}
