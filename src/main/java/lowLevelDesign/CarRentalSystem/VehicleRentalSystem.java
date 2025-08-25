package lowLevelDesign.CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
    List<User> userList;
    List<Store> storeList;

    VehicleRentalSystem(List<Store> stores, List<User> users){
        this.userList=users;
        this.storeList=stores;
    }


    public Store getStore(Location location){
        //based on location, we will filter out the Store from storeList.
        return storeList.get(0);
    }

    //add users
    // remove users
    // add stores
    //remove stores

}
