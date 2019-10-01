package oop.designpattern7;

import java.util.ArrayList;
import java.util.List;

public class Apple {
    int weight;
    String colour;
    int price;
    List<Apple> list = new ArrayList<>();

    public Apple(int weight, String colour, int price) {
        this.weight = weight;
        this.colour = colour;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void sortApples(List<Apple> appleList){
        strategy.sort(appleList);
    }

}
