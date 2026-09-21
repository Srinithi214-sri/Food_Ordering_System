package repository;

import java.util.*;
import model.Customer;

public class CustomerRepository {

    ArrayList<Customer> cust = new ArrayList<>();

    public void addCustomer(Customer customer) {
        cust.add(customer);
    }

    public Customer find(String email) {
        for(Customer cus : cust) {
            String h = cus.getemail();
            if(h.equals(email)) {
                return cus;
            }
        }
        return null;
    }
}