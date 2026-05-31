package lowLevelDesign.DesignParkingLot;

public class Receipt {

    private final String receiptId;
    private final double amount;

    public Receipt(String receiptId,
                   double amount) {

        this.receiptId = receiptId;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getReceiptId() {
        return receiptId;
    }
}
