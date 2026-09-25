package repository;
import java.util.*;
import model.Restaurant;
public class RestaurantRepository {
    ArrayList<Restaurant> res=new ArrayList<>();
    public void addRestaurant(Restaurant restaurant) {
        res.add(restaurant);
    }
     public Restaurant find(String email) {
        for(Restaurant rest:res){
            String h=rest.getemail();
            if(h.equals(email)){
                return rest;
                
            }
        }
        return null;
     }
     public Restaurant findbyrestaurant(String name){
        for(Restaurant rest:res){
            String h=rest.getname();
            if(h.equals(name)){
                return rest;
            }
        }
        return null;

     }
}