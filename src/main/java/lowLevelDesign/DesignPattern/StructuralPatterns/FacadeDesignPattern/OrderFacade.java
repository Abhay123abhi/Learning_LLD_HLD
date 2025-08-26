package lowLevelDesign.DesignPattern.StructuralPatterns.FacadeDesignPattern;

public class OrderFacade {
    ProductDao productDao;
    Invoice invoice;
    Payment payment;

    OrderFacade(){
        productDao=new ProductDao();
        invoice=new Invoice();
        payment= new Payment();
    }

    public void createOrder(){
        Product product= ProductDao.getProduct(123);
        payment.makePayment();
        invoice.generateInvoice();

    }

}
