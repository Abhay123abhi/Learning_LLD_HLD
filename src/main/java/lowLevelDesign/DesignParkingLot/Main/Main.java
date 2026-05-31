package lowLevelDesign.DesignParkingLot.Main;

import lowLevelDesign.DesignParkingLot.ParkingFeesStrategy.BasicHourlyRateStrategy;
import lowLevelDesign.DesignParkingLot.ParkingLot;
import lowLevelDesign.DesignParkingLot.ParkingSpot;
import lowLevelDesign.DesignParkingLot.ParkingStrategy.FirstAvailableStrategy;
import lowLevelDesign.DesignParkingLot.PaymentStrategy.UPIPayment;
import lowLevelDesign.DesignParkingLot.Receipt;
import lowLevelDesign.DesignParkingLot.Ticket;
import lowLevelDesign.DesignParkingLot.Vehicle.Car;
import lowLevelDesign.DesignParkingLot.Vehicle.Vehicle;
import lowLevelDesign.DesignParkingLot.enums.DurationType;
import lowLevelDesign.DesignParkingLot.enums.VehicleType;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ParkingSpot> spots = List.of(

                new ParkingSpot(
                        1,
                        VehicleType.CAR),

                new ParkingSpot(
                        2,
                        VehicleType.CAR),

                new ParkingSpot(
                        3,
                        VehicleType.BIKE)
        );

        ParkingLot parkingLot =
                new ParkingLot(

                        spots,

                        new FirstAvailableStrategy(),

                        new BasicHourlyRateStrategy()
                );

        Vehicle car =
                new Car("HR26AB1234");

        Ticket ticket =
                parkingLot.parkVehicle(car);

        System.out.println(
                "Ticket Generated : "
                        + ticket.getTicketId());

        Receipt receipt =
                parkingLot.exitVehicle(
                        ticket.getTicketId(),
                        3,
                        DurationType.HOURS,
                        new UPIPayment()
                );

        System.out.println(
                "Amount Paid : "
                        + receipt.getAmount());
    }
}
