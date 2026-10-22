package repository;

import java.util.ArrayList;
import model.Order;

public class OrderRepository {

    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Order> getAllOrders() {
        return orders;
    }

    public Order findByID(String orderID) {
        for (Order order : orders) {
            if (order.getorderID().equals(orderID)) {
                return order;
            }
        }
        return null;
    }
}