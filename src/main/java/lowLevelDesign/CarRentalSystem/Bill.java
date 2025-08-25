package lowLevelDesign.CarRentalSystem;

public class Bill {
    Reservation reservation;
    double totalAmount;
    Boolean isBillPaid;

    Bill(Reservation reservation){
        this.reservation=reservation;
        this.totalAmount=computeAmount();
        isBillPaid=false;
    }

    private double computeAmount() {
        return 100.00;
    }
}
