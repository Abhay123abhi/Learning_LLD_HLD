package lowLevelDesign.DesignParkingLot.Vehicle;

import lowLevelDesign.DesignParkingLot.enums.VehicleType;

public class Car extends Vehicle {
    public Car(String licenseNumber) {
        super(licenseNumber, VehicleType.CAR);
    }
}
