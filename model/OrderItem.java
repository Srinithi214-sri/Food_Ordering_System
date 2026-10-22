package model;
public class OrderItem {
    private String OrderItemID;
    private String OrderID;
    private String FoodID;
    private int Quantity;
    public OrderItem(String OrderItemID,String OrderID,String FoodID,int Quantity){
        this.OrderItemID=OrderItemID;
        this.OrderID=OrderID;
        this.FoodID=FoodID;
        this.Quantity=Quantity;
    }
    public void setOrderItemID(String OrderItemID){
        this.OrderItemID=OrderItemID;
    }
    public void setOrderID(String OrderID){
        this.OrderID=OrderID;
    }   
    public void setFoodID(String FoodID){
        this.FoodID=FoodID;
    }
    public void setQuantity(int Quantity){
        this.Quantity=Quantity;
    }
    public String getOrderItemID(){
        return OrderItemID;
    }
    public String getOrderID(){
        return OrderID;
    }
    public String getFoodID(){
        return FoodID;
    }
    public int getQuantity(){
        return Quantity;
    }
}