package lowLevelDesign.DesignParkingLot;

import lowLevelDesign.DesignParkingLot.Vehicle.Vehicle;
import lowLevelDesign.DesignParkingLot.enums.VehicleType;

public class ParkingSpot {
    private final int id;
    private final VehicleType spotType;
    private boolean available;
    private Vehicle parkedVehicle;

    public ParkingSpot(int id, VehicleType spotType) {
        this.id = id;
        this.spotType = spotType;
        this.available = true;
    }

    public boolean canFit(Vehicle vehicle){
        return available && vehicle.getvehicleType()==spotType;
    }

    public void park(Vehicle vehicle){
        parkedVehicle=vehicle;
        available=false;
    }
    public void removeVehicle(){
        parkedVehicle=null;
        available=true;
    }
    public int getId(){
        return id;
    }
    public boolean isAvailable(){
        return available;
    }
    public VehicleType getSpotType() {
        return spotType;
    }
}
