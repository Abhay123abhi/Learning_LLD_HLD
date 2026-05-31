package lowLevelDesign.DesignParkingLot.ParkingFeesStrategy;

import lowLevelDesign.DesignParkingLot.enums.DurationType;
import lowLevelDesign.DesignParkingLot.enums.VehicleType;

public class BasicHourlyRateStrategy implements ParkingFeesStrategy {
    @Override
    public double calculateFee(VehicleType vehicleType, int duration, DurationType durationType) {
        double ratePerHour = switch(vehicleType){
            case CAR -> 10.0;
            case BIKE -> 5.0;
            case AUTO -> 7.0;
            default -> 15.0;
        };
        return durationType == DurationType.HOURS
                ? duration * ratePerHour
                : duration * ratePerHour * 24;
    }
}
