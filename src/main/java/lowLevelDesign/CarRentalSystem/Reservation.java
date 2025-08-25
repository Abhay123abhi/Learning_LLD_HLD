package lowLevelDesign.CarRentalSystem;

import lowLevelDesign.CarRentalSystem.Product.Vehicle;

import java.util.Date;
import java.util.Random;

public class Reservation {
    String reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public String createReserve(User user, Vehicle vehicle){
        Random random = new Random();
        reservationId= user.getUserName()+"_"+random.nextInt();
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }
    // CRUD operations
}
