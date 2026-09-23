package controller;
import model.Restaurant;
import repository.RestaurantRepository;
public class RestaurantController {
    int r=1;
    RestaurantRepository repo=new RestaurantRepository();
    public void register(String name,String address,String email,String contact,String password){
        String resID="RES"+""+r++;
        Restaurant restaurant=new Restaurant(resID,name,address,email,contact,password);
        repo.addRestaurant(restaurant);
        System.out.println("Restaurant Registered Successfully");
    }
    public boolean login(String email,String password) {
        Restaurant restaurant=repo.find(email);
        if(restaurant==null){
            System.out.println("No Restaurant Found");
            return false;
        }
        else {
            if(restaurant.getPassword().equals(password)){
                System.out.println("Login Successful");
                return true;
            }
            else{
                System.out.println("Invalid Credentials");
                return false;
            }
        }
    }
}
