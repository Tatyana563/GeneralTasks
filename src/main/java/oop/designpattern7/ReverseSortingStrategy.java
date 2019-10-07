package oop.designpattern7;

import java.util.Comparator;
import java.util.List;

public class ReverseSortingStrategy implements Strategy {
    @Override
    public void add(List<Apple> list, Apple apple) {
        list.add(apple);
        list.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                if(o2.weight==o1.weight)
                return 0;
                if(o2.weight>o1.weight)
                    return 1;
                else{
                    return -1;
                }
            }
        });
        System.out.println(list);
    }
}
