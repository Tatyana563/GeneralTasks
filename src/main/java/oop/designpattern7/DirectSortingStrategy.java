package oop.designpattern7;

        import java.util.Comparator;
        import java.util.List;

public class DirectSortingStrategy implements Strategy {

    @Override
    public void add(List<Apple> list, Apple apple) {
        list.add(apple);
        list.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                if (o1.weight == o2.weight)
                    return 0;
                if (o1.weight > o2.weight)
                    return 1;
                else {
                    return -1;
                } }

        });
        System.out.println(list);
    }
}