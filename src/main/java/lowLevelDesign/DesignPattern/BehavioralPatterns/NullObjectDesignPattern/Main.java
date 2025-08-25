package lowLevelDesign.DesignPattern.BehavioralPatterns.NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle= VehicleObjectFactory.getVehicleObj("Car");
        System.out.println("Car Tank Capacity: "+vehicle.getTankCapacity());
        System.out.println("Car Setting Capacity: "+vehicle.getSettingCapacity());
    }
}
