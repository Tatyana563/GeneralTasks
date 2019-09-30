package oop.designpattern6;

public class TestDecorator {
    public static void main(String[] args) {
       Tea myTea = new SimpleTea(20);
        System.out.println(myTea.price());
    // myTea= new MilkTeaDecorator(new SimpleTea(25),5);
        myTea = new MilkTeaDecorator(new SimpleTea(25),10);
    }
}
