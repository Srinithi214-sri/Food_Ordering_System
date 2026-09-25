import controller.CustomerController;
import controller.RestaurantController;
import repository.FoodRepository;
import repository.RestaurantRepository;
import view.CustomerView;
import view.RestaurantView;
public class main{
    public static void main(String[] args){
        FoodRepository foodrepo=new FoodRepository();
        RestaurantRepository restaurantRepo = new RestaurantRepository();

       CustomerController customer = new CustomerController(restaurantRepo, foodrepo);
        RestaurantController restaurant = new RestaurantController(restaurantRepo, foodrepo);

        RestaurantView restaurantView = new RestaurantView();
        restaurantView.start(restaurant);

        CustomerView customerView = new CustomerView();
        customerView.start(customer);
    }
}