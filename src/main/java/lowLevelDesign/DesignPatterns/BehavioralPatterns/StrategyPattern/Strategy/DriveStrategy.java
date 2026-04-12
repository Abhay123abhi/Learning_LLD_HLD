package lowLevelDesign.DesignPatterns.BehavioralPatterns.StrategyPattern.Strategy;

public interface DriveStrategy {
    void drive();
}

/*
Strategy design pattern use when the child class have same code which is not present in parent class
it will remove code duplication and tight coupling and provide code reusability.
*/