package model;
public class Order{
    private String orderID;
    private String customerID;
    private String restaurantID;
    private double TotalAmount;
    public Order(String orderID,String customerID,String restaurantID,double TotalAmount){
        this.orderID=orderID;
        this.customerID=customerID;
        this.restaurantID=restaurantID;
        this.TotalAmount=TotalAmount;
    }
    public void setorderID(String orderID){
        this.orderID=orderID;
    }
    public void setcustomerID(String customerID){
        this.customerID=customerID;
    }
    public void setrestaurantID(String restaurantID){
        this.restaurantID=restaurantID;
    }
    public void setTotalAmount(double TotalAmount){
        this.TotalAmount=TotalAmount;
    }
    public String getorderID(){
        return orderID;
    }
    public String getcustomerID(){
        return customerID;
    }
    public String getrestaurantID(){
        return restaurantID;
    }
    public double getTotalAmount(){
        return TotalAmount;
    }
}