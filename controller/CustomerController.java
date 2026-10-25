package controller;
import java.util.ArrayList;
import model.Customer;
import model.Food;
import model.Restaurant;
import repository.CustomerRepository;
import repository.FoodRepository;
import repository.RestaurantRepository;
public class CustomerController {

    CustomerRepository repo = new CustomerRepository();
    private Customer loggedInCustomer;
    FoodRepository foodrepo;
    RestaurantRepository restaurantRepo;
    
    public CustomerController(RestaurantRepository restaurantRepo, FoodRepository foodrepo) {
    this.foodrepo = foodrepo;
    this.restaurantRepo = restaurantRepo;
    }
    int f=1;
    public void register(String name,String email,String phone,String address,String password){
        
       
       if(!email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")){
        System.out.println("Invalid Email");
        return;
        }
        if(!phone.matches("^[0-9]{10}$")){
            System.out.println("Invalid Phone Number");
            return;
        }
        if(!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")){
            System.out.println("Invalid Password");
            return;
        }
        if(repo.find(email)!=null){
            System.out.println("Email already exists");
            return;
        }
         String cus_ID="CUS"+""+f++;
        Customer customer=new Customer(cus_ID,name, email, phone, address, password);
        repo.addCustomer(customer);
        System.out.println("Customer Registered Successfully");
        System.out.println();
        System.out.println("======LOGIN======");
        
    }
    public boolean login(String email,String password){
        Customer customer=repo.find(email);
        if(customer==null){
            System.out.println("User not found");
            return false;
        } else {
            if(customer.getpass().equals(password)) {
                loggedInCustomer = customer;
                System.out.println();
                System.out.println("LOGIN SUCCESSFUL");
                System.out.println();

                return true;
            } else {
                System.out.println("Invalid password");
                return false;
            }
        }
    }
    public String getLoggedInCustomerID() {
    if (loggedInCustomer == null) {
        return null;
    }
    return loggedInCustomer.getID();
}
    public void displayAllRestaurants(){
         ArrayList<Restaurant> restaurants = restaurantRepo.getAllRestaurants();
         int i = 1;
            for(Restaurant rest : restaurants){
            System.out.println(i + ". " + rest.getname());
            i++;
            }
    }
    public void searchRestaurant(String name){
        
        Restaurant restaurant = restaurantRepo.findbyrestaurant(name);
        if(restaurant != null) {
            
            System.out.println("Restaurant: " + restaurant.getname());
            System.out.println("Email: "+restaurant.getemail());
            System.out.println("Phone Number: "+restaurant.getcontact());
            System.out.println("Address: "+restaurant.getaddress());
            ArrayList<Food> foods = foodrepo.findbyrestaurant(restaurant.getID());
            System.out.println();
            System.out.println("Food Items");
            int i=1;
            for(Food food:foods){
                System.out.println(i + ". " + "Food: " + food.getfoodname() + "  " + "Price: " + food.getfoodprice());
                i++;
            }
        } else {
            System.out.println("Restaurant not found");
        }
    }
    public void displayAllFoods(){
        ArrayList<Food> foods=foodrepo.getAllFoods();
        int i=1;
        for(Food food:foods){
            Restaurant restaurant = restaurantRepo.findbyID(food.getresID());
            System.out.println(i+". "+"Food: "+food.getfoodname()+"  "+"Price: "+food.getfoodprice());
            System.out.println("Restaurant: "+restaurant.getname());
            System.out.println();
            i++;
        }
    }
    public Food getFoodByNumber(int foodNumber) {
    ArrayList<Food> foods = foodrepo.getAllFoods();

    if (foodNumber < 1 || foodNumber > foods.size()) {
        return null;
    }

    return foods.get(foodNumber - 1);
}
    public ArrayList<Food> getAllFoodsForOrdering() {
        return foodrepo.getAllFoods();
    }

    public ArrayList<Food> getFoodsByRestaurantName(String name) {
        Restaurant restaurant = restaurantRepo.findbyrestaurant(name);

        if (restaurant == null) {
            return new ArrayList<>();
        }

        return foodrepo.findbyrestaurant(restaurant.getID());
    }
}