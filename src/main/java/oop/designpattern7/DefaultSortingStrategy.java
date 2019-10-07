package oop.designpattern7;

import java.util.List;

public class DefaultSortingStrategy implements Strategy {
    @Override
    public void add(List<Apple> list, Apple apple) {
        list.add(apple);
        System.out.println(list);
    }
}
