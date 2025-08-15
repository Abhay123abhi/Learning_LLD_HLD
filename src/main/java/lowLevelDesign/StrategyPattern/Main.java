package lowLevelDesign.StrategyPattern;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle= new GoodsVehical();
        vehicle.drive();

        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();
    }
}
