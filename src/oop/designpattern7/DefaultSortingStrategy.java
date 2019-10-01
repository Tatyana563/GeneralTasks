package oop.designpattern7;

import java.util.List;

public class DefaultSortingStrategy implements Strategy {
    @Override
    public void sort(List<Apple> list) {
        System.out.println(list);
    }
}
