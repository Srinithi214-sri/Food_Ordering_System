package view;
import java.util.*;
import controller.CustomerController;
public class CustomerView {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
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
        CustomerController customer=new CustomerController();
        customer.register(name,email,phne,addr,pass);
        System.out.println("Enter Email: ");
        String logemail=sc.nextLine();
        System.out.println("Enter Password: ");
        String logpass=sc.nextLine();
        boolean LoggedIn=customer.login(logemail,logpass);
        if(LoggedIn==true){
            System.out.print("======Customer DashBoard======");
            System.out.println();
            System.out.println("1. Search Restaurant");
            System.out.println("2. Browse Food");
            System.out.println("3. Place Order");
            System.out.println("4. View Orders");
            System.out.println("5. Logout");
            System.out.println();
            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();
        }

    }
}