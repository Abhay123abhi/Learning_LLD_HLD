package lowLevelDesign.DesignParkingLot.PaymentStrategy;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing with UPI payment" +amount);
    }
}
