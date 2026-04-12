package lowLevelDesign.DesignPatterns.StructuralPatterns.FacadeDesignPattern;

public class ProductDao {
    public static Product getProduct(int productId){
        System.out.println("Product Created !");
        return new Product();
    }
}
