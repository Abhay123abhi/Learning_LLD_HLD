package lowLevelDesign.DesignParkingLot.ParkingStrategy;

import lowLevelDesign.DesignParkingLot.ParkingSpot;
import lowLevelDesign.DesignParkingLot.Vehicle.Vehicle;

import java.util.List;

public class FirstAvailableStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findSpot(List<ParkingSpot> spots, Vehicle vehicle) {
        for(ParkingSpot spot:spots){
            if(spot.canFit(vehicle)){
                return spot;
            }
        }
        return null;
    }
}
