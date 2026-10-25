
package repository;

import java.util.ArrayList;
import model.Delivery;

public class DeliveryRepository {

    private ArrayList<Delivery> deliveries = new ArrayList<>();

    public void addDelivery(Delivery delivery) {
        deliveries.add(delivery);
    }

    public Delivery findByOrderID(String orderID) {
        for (Delivery delivery : deliveries) {
            if (delivery.getOrderID().equals(orderID)) {
                return delivery;
            }
        }
        return null;
    }

    public ArrayList<Delivery> getAllDeliveries() {
        return deliveries;
    }
}
