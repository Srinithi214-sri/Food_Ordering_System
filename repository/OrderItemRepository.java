package repository;

import java.util.ArrayList;
import model.OrderItem;

public class OrderItemRepository {

    private ArrayList<OrderItem> orderItems = new ArrayList<>();

    public void addOrderItem(OrderItem item) {
        orderItems.add(item);
    }

    public ArrayList<OrderItem> getAllOrderItems() {
        return orderItems;
    }

    public ArrayList<OrderItem> findByOrderID(String orderID) {
        ArrayList<OrderItem> items = new ArrayList<>();

        for (OrderItem item : orderItems) {
            if (item.getOrderID().equals(orderID)) {
                items.add(item);
            }
        }

        return items;
    }
}