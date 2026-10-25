package model;
public class Delivery {
    private String deliveryID;
    private String orderID;
    private String deliveryStatus;

    public Delivery(String deliveryID, String orderID, String deliveryStatus) {
        this.deliveryID = deliveryID;
        this.orderID = orderID;
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryID() {
        return deliveryID;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
