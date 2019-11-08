package oop.designpattern10_wiki;
//https://en.wikipedia.org/wiki/Builder_pattern
public class Car {
    private final int wheel;
    private final String color;

    public Car(int wheel, String color) {
        this.wheel = wheel;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Car [wheels = " + wheel+ ", color = " + color + "]";
    }
}

