package controller;
import model.Restaurant;
import repository.RestaurantRepository;
public class RestaurantController {
    int r=1;
    RestaurantRepository repo=new RestaurantRepository();
    public void register(String name,String address,String email,String contact){
        String resID="RES"+""+r++;
        Restaurant restaurant=new Restaurant(resID,name,address,email,contact);
        repo.addRestaurant(restaurant);
        System.out.println("Restaurant Registered Successfully");
    }
}
