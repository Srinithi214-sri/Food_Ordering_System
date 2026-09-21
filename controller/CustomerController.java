package controller;
import model.Customer;
import repository.CustomerRepository;
public class CustomerController {

    CustomerRepository repo = new CustomerRepository();
    
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
        // System.out.println("Customer ID: "+cus_ID);
    }
    public boolean login(String email,String password){
        Customer customer=repo.find(email);
        if(customer==null){
            System.out.println("User not found");
            return false;
        } else {
            if(customer.getpass().equals(password)) {
                System.out.println("Login successful");
                return true;
            } else {
                System.out.println("Invalid password");
                return false;
            }
        }
    }
}