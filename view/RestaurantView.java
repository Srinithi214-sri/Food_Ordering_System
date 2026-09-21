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
        RestaurantController restaurant=new RestaurantController();
        restaurant.register(name, address, email, contact);

    }
}
