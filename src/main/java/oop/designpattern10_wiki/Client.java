package oop.designpattern10_wiki;

public class Client {
    public static void main(String[] args) {
        Car car = new CarBuilder().setWheel(4).setColor("Black").build();
        System.out.print(car);
    }
}
