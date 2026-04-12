package lowLevelDesign.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adapter;

import lowLevelDesign.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine=weightMachine;
    }

    @Override
    public double getWeight() {
        double weightInPound = weightMachine.getWeightInPound();
        //Convert it to KGs
        double weightInKg = weightInPound * .45;
        return weightInKg;
    }
}
