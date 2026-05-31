package lowLevelDesign.DesignParkingLot;
import lowLevelDesign.DesignParkingLot.ParkingFeesStrategy.ParkingFeesStrategy;
import lowLevelDesign.DesignParkingLot.ParkingStrategy.ParkingStrategy;
import lowLevelDesign.DesignParkingLot.Vehicle.Vehicle;
import lowLevelDesign.DesignParkingLot.enums.DurationType;
import lowLevelDesign.DesignParkingLot.PaymentStrategy.*;
import java.util.*;

public class ParkingLot {

    private final List<ParkingSpot> spots;

    private final ParkingStrategy parkingStrategy;

    private final ParkingFeesStrategy feeStrategy;

    private final Map<String, Ticket> activeTickets;

    public ParkingLot(
            List<ParkingSpot> spots,
            ParkingStrategy parkingStrategy,
            ParkingFeesStrategy feeStrategy) {

        this.spots = spots;
        this.parkingStrategy = parkingStrategy;
        this.feeStrategy = feeStrategy;
        this.activeTickets = new HashMap<>();
    }

    public Ticket parkVehicle(
            Vehicle vehicle) {

        ParkingSpot spot =
                parkingStrategy.findSpot(
                        spots,
                        vehicle);

        if (spot == null) {
            throw new RuntimeException(
                    "No Spot Available");
        }

        spot.park(vehicle);

        Ticket ticket =
                new Ticket(
                        UUID.randomUUID()
                                .toString(),
                        vehicle,
                        spot
                );

        activeTickets.put(
                ticket.getTicketId(),
                ticket);

        return ticket;
    }

    public Receipt exitVehicle(
            String ticketId,
            int duration,
            DurationType durationType,
            PaymentStrategy paymentStrategy) {

        Ticket ticket =
                activeTickets.remove(ticketId);

        if (ticket == null) {
            throw new RuntimeException(
                    "Invalid Ticket");
        }

        double fee =
                feeStrategy.calculateFee(
                        ticket.getVehicle()
                                .getvehicleType(),
                        duration,
                        durationType
                );

        paymentStrategy.pay(fee);

        ticket.getParkingSpot()
                .removeVehicle();

        return new Receipt(
                UUID.randomUUID()
                        .toString(),
                fee
        );
    }
}
