package lowLevelDesign.DesignParkingLot.ParkingStrategy;

import lowLevelDesign.DesignParkingLot.ParkingSpot;
import lowLevelDesign.DesignParkingLot.Vehicle.Vehicle;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot findSpot(List<ParkingSpot> spots, Vehicle vehicle);
}
