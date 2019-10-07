package oop.designpattern2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Meal {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);

    }
    public float getCoast(){
        float cost = 0.0f;
        for(Item item:items){
            cost=cost+item.price();
        }
        return cost;
    }
    public void showItems(){
        for(Item it:items){
            System.out.println("Item: "+it.name());
            System.out.println("Packing: "+it.packing().pack());
            System.out.println("Price: "+it.price());
        }
    }
    public class MealBuilder{
       public Meal prepareVegMeal(){
           Meal meal = new Meal();
           meal.addItem(new VegBurger());
           meal.addItem(new Coke());
           return meal;
       }
       public Meal prepareNonVegMeal(){
           Meal meal = new Meal();
           meal.addItem(new ChickenBurger());
           meal.addItem(new Pepsi());
           return meal;
       }
    }
}
