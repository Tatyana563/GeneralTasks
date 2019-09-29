package oop.designpattern5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new DivideStrategy());
        calculator.calculate(2, 2);
        calculator.setStrategy(new AddStrategy());
        calculator.calculate(2, 2);

        Map<String, Integer> map = new TreeMap<String, Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        map.put("1", 1);
        map.put("2", 1);
        map.put("3", 1);
        map.put("4", 1);

        System.out.println(map);
    }
}
