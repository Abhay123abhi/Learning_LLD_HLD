package lowLevelDesign.DesignParkingLot.ParkingFeesStrategy;

import lowLevelDesign.DesignParkingLot.enums.DurationType;
import lowLevelDesign.DesignParkingLot.enums.VehicleType;

public interface ParkingFeesStrategy {
    double calculateFee(VehicleType vehicleType, int duration, DurationType durationType);
}
