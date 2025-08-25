package lowLevelDesign.DesignPattern.StructuralPatterns.AdapterDesignPattern.Client;

import lowLevelDesign.DesignPattern.StructuralPatterns.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import lowLevelDesign.DesignPattern.StructuralPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import lowLevelDesign.DesignPattern.StructuralPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeight());

    }
}
