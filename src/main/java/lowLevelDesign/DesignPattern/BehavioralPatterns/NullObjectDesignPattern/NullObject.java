package lowLevelDesign.DesignPattern.BehavioralPatterns.NullObjectDesignPattern;

public class NullObject implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSettingCapacity() {
        return 0;
    }
}
