package repository;
import java.util.*;
import model.Restaurant;
public class RestaurantRepository {
    ArrayList<Restaurant> res=new ArrayList<>();
    public void addRestaurant(Restaurant restaurant) {
        res.add(restaurant);
    }
 
}