package controller;
import model.Food;
import model.Restaurant;
import repository.FoodRepository;
import repository.RestaurantRepository;
public class RestaurantController {
    int r=1;
    String res_ID="";
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
                res_ID=restaurant.getID();
                return true;
            }
            else{
                System.out.println("Invalid Credentials");
                return false;
            }
        }
        
    }
    int f=1;
    FoodRepository foodrepo = new FoodRepository();
    public void addFood(String name,double price){
        String foodID="FOOD"+""+f++;
        Food food=new Food(foodID,name,price,res_ID);
        System.out.println("Restaurant ID: "+res_ID);
        foodrepo.addFood(food);
        System.out.println("Food Added Successfully");
    }
}
