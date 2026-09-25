package view;
import controller.RestaurantController;
import java.util.*;
public class RestaurantView {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Restaurant Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Restaurant Address: ");
        String address=sc.nextLine();
        System.out.println("Enter Restaurant Email:");
        String email=sc.nextLine();
        System.out.println("Enter Restuarant Contact Number: ");
        String contact=sc.nextLine();
        System.out.println("Enter Password: ");
        String password=sc.nextLine();
        RestaurantController restaurant=new RestaurantController();
        restaurant.register(name, address, email, contact, password);
        System.out.println("Enter Email: ");
        String logemail=sc.nextLine();
        System.out.println("Enter Password: ");
        String logpass=sc.nextLine();
        boolean loggedIn=restaurant.login(logemail,logpass);
        if(loggedIn==true){
            int choice=0;
            while(choice!=4){
            System.out.println("======Restaurant Dashboard======");
            System.out.println("1. Add Food Item");
            System.out.println("2. View Orders");
            System.out.println("3. Update Order Status");
            System.out.println("4. Logout");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine(); // Consume the newline character
            switch(choice){
                case 1:
                    System.out.println("Enter Food Name: ");
                    String foodname=sc.nextLine();
                    System.out.println("Enter Food Price: ");
                    double foodprice=sc.nextDouble();
                    sc.nextLine();
                    restaurant.addFood(foodname,foodprice);
                    break;
                case 2:
                        //
                        break;
                case 3:
                            //
                         break;
                case 4:
                    System.out.println("Logged Out Successfully");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            }
        }
    }
}
