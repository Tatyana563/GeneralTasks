package oop.designpattern10_wiki;

public class CarBuilder {
    private int wheel;
    private String color;

    public CarBuilder setWheel(int wheel) {
        this.wheel = wheel;
        return this;
    }
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

   public Car build(){
        return new Car(wheel,color);
   }


}
