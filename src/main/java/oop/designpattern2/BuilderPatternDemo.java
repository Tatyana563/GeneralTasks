package oop.designpattern2;
//https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Meal m = new Meal();
        Meal.MealBuilder mb = m.new MealBuilder();
      Meal.MealBuilder mealBuilder =new Meal().new MealBuilder();
      Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg meal");
        vegMeal.showItems();
        System.out.println("Total cost:"+vegMeal.getCoast());

       Meal nonVegMeal= mb.prepareNonVegMeal();
        System.out.println("Non veg meal:");
        nonVegMeal.showItems();

    }
}
