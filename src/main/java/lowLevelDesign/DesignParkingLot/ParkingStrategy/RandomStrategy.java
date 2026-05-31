package lowLevelDesign.DesignParkingLot.ParkingStrategy;

import lowLevelDesign.DesignParkingLot.ParkingSpot;
import lowLevelDesign.DesignParkingLot.Vehicle.Vehicle;

import java.util.List;
import java.util.Random;

public class RandomStrategy implements ParkingStrategy{
    private final Random random = new Random();

    @Override
    public ParkingSpot findSpot(List<ParkingSpot> spots, Vehicle vehicle) {
        int n = spots.size();

        for(int i=0;i<n;i++){
            int idx=random.nextInt(n);
            ParkingSpot spot = spots.get(idx);
            if(spot.canFit(vehicle)){
                return spot;
            }
        }
        return null;
    }
}
