package model;
public class Food{
    private String food_ID;
    private String food_name;
    private double food_price;
    private String res_ID;
    public Food(String food_ID,String food_name,double food_price,String res_ID) {
        this.food_ID=food_ID;
        this.food_name=food_name;
        this.food_price=food_price;
        this.res_ID=res_ID;
    }
    public void setfoodID(String food_ID) {
        this.food_ID=food_ID;
    }
    public void setfoodname(String food_name){
        this.food_name=food_name;
    }
    public void setfoodprice(double food_price){
        this.food_price=food_price;
    }
    public void setresID(String res_ID){
        this.res_ID=res_ID;        
    }
    public String getfoodID(){
         return this.food_ID;
    }
    public String getfoodname(){
        return this.food_name;
    }
    public double getfoodprice(){
        return this.food_price;
    }
    public String getresID(){
        return this.res_ID;
    }
}