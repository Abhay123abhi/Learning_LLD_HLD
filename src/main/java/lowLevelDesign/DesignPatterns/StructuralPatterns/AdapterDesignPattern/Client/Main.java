package lowLevelDesign.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Client;

import lowLevelDesign.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import lowLevelDesign.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import lowLevelDesign.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeight());

    }
}
