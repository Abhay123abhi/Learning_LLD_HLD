package lowLevelDesign.DesignParkingLot.ParkingFeesStrategy;

import lowLevelDesign.DesignParkingLot.enums.DurationType;
import lowLevelDesign.DesignParkingLot.enums.VehicleType;

public class PremiumRateStrategy implements ParkingFeesStrategy {
    @Override
    public double calculateFee(VehicleType vehicleType, int duration, DurationType durationType) {
        double ratePerHour = switch(vehicleType){
            case CAR -> 20.0;
            case BIKE -> 15.0;
            case AUTO -> 10.0;
            default -> 30.0;
        };
        return durationType == DurationType.HOURS
                ? ratePerHour * duration
                : ratePerHour * duration *24;
    }
}
