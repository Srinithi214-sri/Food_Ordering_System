import controller.CustomerController;
import controller.RestaurantController;
import repository.FoodRepository;
import view.CustomerView;
import view.RestaurantView;
public class main{
    public static void main(String[] args){
        FoodRepository foodrepo=new FoodRepository();
        CustomerController customer=new CustomerController(foodrepo);
        RestaurantController restaurant=new RestaurantController(foodrepo);
        RestaurantView restaurantView = new RestaurantView();
        restaurantView.start(restaurant);
        CustomerView customerView = new CustomerView();
        customerView.start(customer);
    }
}