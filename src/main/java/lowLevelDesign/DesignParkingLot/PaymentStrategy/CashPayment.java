package lowLevelDesign.DesignParkingLot.PaymentStrategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing with cash payment" +amount);
    }
}
