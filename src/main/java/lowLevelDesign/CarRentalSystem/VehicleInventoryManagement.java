package lowLevelDesign.CarRentalSystem;

import lowLevelDesign.CarRentalSystem.Product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicle;
    VehicleInventoryManagement(List<Vehicle> vehicle){
        this.vehicle=vehicle;
    }

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
}
