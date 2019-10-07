package oop.designpattern7;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Apple {
    final int weight;
    private final String colour;
    int price;
    List<Apple> list = new ArrayList<>();

    public void add(Apple apple) {
        strategy.add(list, apple);
    }

    public Apple(int weight, String colour, int price) {
        this.weight = weight;
        this.colour = colour;
        this.price = price;
    }
    private Strategy strategy;

}
