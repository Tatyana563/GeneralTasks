package oop.designpattern7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testApple {
    public static void main(String[] args) {
        Apple a1 = new Apple(50, "green", 10);
        Apple a2 = new Apple(70, "green", 5);
        Apple a3 = new Apple(40, "green", 20);
        Apple a4 = new Apple(60, "green", 15);
        List<Apple> apples = new ArrayList<Apple>();
        Collections.addAll(apples, a1, a2, a3, a4);
        System.out.println("Unmodified list: " + apples);

        a1.setStrategy(new DirectSortingStrategy());
        a1.add(a1);
        a1.add(a2);
        a1.setStrategy(new ReverseSortingStrategy());
        a1.add(a3);
        a1.add(a4);
        //a1.setStrategy(new DefaultSortingStrategy());
        //a1.sortApples(apples);
    }
}
