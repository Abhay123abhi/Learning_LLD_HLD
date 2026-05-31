package lowLevelDesign.DesignParkingLot.Vehicle;
import lowLevelDesign.DesignParkingLot.enums.VehicleType;

public abstract class Vehicle {
    protected String licenseNumber;
    protected VehicleType vehicleType;

    public Vehicle(String licenseNumber, VehicleType vehicleType) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }

    public VehicleType getvehicleType() {
        return vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
