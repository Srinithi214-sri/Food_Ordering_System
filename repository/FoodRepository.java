package model;
import java.util.*;
import model.Food;
public class FoodRepository {
    ArrayList<Food> food=new ArrayList<>();
    public void addFood(Food food1){
        food.add(food1);
    }
}