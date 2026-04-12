package lowLevelDesign.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adaptee;

public class WeightMachineForBabies implements WeightMachine{
    @Override
    public double getWeightInPound() {
        return 20;
    }
}
