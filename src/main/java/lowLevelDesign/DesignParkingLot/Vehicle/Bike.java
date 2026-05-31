package lowLevelDesign.DesignParkingLot.Vehicle;
import lowLevelDesign.DesignParkingLot.enums.VehicleType;

public class Bike extends Vehicle {
    public Bike(String licenseNumber) {
        super(licenseNumber, VehicleType.BIKE);
    }
}
