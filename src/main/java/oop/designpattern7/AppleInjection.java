package oop.designpattern7;

public class AppleInjection {

    public void changeAppleProperties() {
        Apple apple = new Apple(1, "1", 1 );
        Apple apple1 = Apple.builder().price(12121).build();

    }
}
