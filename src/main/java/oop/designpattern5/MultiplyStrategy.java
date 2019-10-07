package oop.designpattern5;

public class MultiplyStrategy implements Strategy {
    @Override
    public Number execute(Number value1, Number value2) {
        return value1.intValue() * value2.intValue();
    }
}