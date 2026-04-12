package lowLevelDesign.DesignPatterns.BehavioralPatterns.NullObjectDesignPattern;

public class VehicleObjectFactory {
    public static Vehicle getVehicleObj(String type){
        if(type.equals("Car")){
            return new Car();
        }else{
            return new NullObject();
        }
    }

}
