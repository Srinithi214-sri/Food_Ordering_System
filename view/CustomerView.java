package view;
import controller.CustomerController;
import controller.OrderController;
import model.Food;
import java.util.*;
public class CustomerView {
    private int orderCounter = 1;
    private int itemCounter = 1;
    public void start(CustomerController customer,OrderController orderController) {
        Scanner sc=new Scanner(System.in);
        // OrderController orderController = new OrderController();
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Email: ");
        String email=sc.nextLine();
        System.out.println("Enter Phone_Number: ");
        String phne=sc.nextLine();
        System.out.println("Enter Address: ");
        String addr=sc.nextLine();
        System.out.println("Your Password: ");
        String pass=sc.nextLine();
        // CustomerController customer=new CustomerController();
        customer.register(name,email,phne,addr,pass);
        System.out.println("Enter Email: ");
        String logemail=sc.nextLine();
        System.out.println("Enter Password: ");
        String logpass=sc.nextLine();
        boolean LoggedIn=customer.login(logemail,logpass);
        if(LoggedIn==true){
            boolean running = true;

            while (running) {
            System.out.print("======Customer DashBoard======");
            System.out.println();
            System.out.println("1. Search Restaurant");
            System.out.println("2. Browse Food");
            System.out.println("3. View Orders");
            System.out.println("4. Logout");
            System.out.println();
            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    customer.displayAllRestaurants();
                    sc.nextLine();

                    System.out.println("Enter Restaurant Name:");
                    String restaurantName = sc.nextLine();

                    customer.searchRestaurant(restaurantName);

                    ArrayList<Food> restaurantFoods =
                            customer.getFoodsByRestaurantName(restaurantName);

                    if (!restaurantFoods.isEmpty()) {
                        orderFood(sc, customer, orderController, restaurantFoods);
                    } else {
                        System.out.println("No food items available for this restaurant.");
                    }
                    break;
                case 2:
                    
                    System.out.println("========Available Foods========");
                    customer.displayAllFoods();

                    ArrayList<Food> allFoods = customer.getAllFoodsForOrdering();

                    orderFood(sc, customer, orderController, allFoods);
                    break;

                    
                case 3:
                    String customerID = customer.getLoggedInCustomerID();
                    orderController.viewCustomerOrders(customerID);
                     break;
                case 4:
                     System.out.println("Logging out...");
                     running=false;
                      break;
            }
         }
        }

    }
    

private void orderFood(Scanner sc, CustomerController customer,
        OrderController orderController, ArrayList<Food> foods) {

    ArrayList<Food> cart = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();

    while (true) {
        for (int i = 0; i < foods.size(); i++)
            System.out.println((i + 1) + ". " + foods.get(i).getfoodname()
                    + " - " + foods.get(i).getfoodprice());

        System.out.println("Enter food number (0 to finish):");
        int n = sc.nextInt();
        if (n == 0) break;
        if (n < 1 || n > foods.size()) {
            System.out.println("Invalid food number.");
            continue;
        }

        Food food = foods.get(n - 1);
        if (!cart.isEmpty() && !cart.get(0).getresID().equals(food.getresID())) {
            System.out.println("Choose food from the same restaurant.");
            continue;
        }

        System.out.println("Enter quantity:");
        int q = sc.nextInt();
        if (q <= 0) {
            System.out.println("Invalid quantity.");
            continue;
        }

        cart.add(food);
        quantities.add(q);
    }

    if (cart.isEmpty()) {
        System.out.println("Cart is empty.");
        return;
    }

    orderController.Orderfromfood("ORD" + orderCounter++,
            customer.getLoggedInCustomerID(), cart, quantities);
}


}