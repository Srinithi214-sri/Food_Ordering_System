package repository;
import java.util.*;
import model.Food;
public class FoodRepository {
    ArrayList<Food> food=new ArrayList<>();
    public void addFood(Food food1){
        food.add(food1);
    }
    public ArrayList<Food> findbyrestaurant(String res_ID){
        ArrayList<Food> result=new ArrayList<>();
        for(Food f:food){
            String h=f.getresID();
            if(h.equals(res_ID)){
                result.add(f);
            }
        }
       return result;
    }
}