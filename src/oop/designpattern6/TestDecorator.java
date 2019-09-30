package oop.designpattern6;

public class TestDecorator {
    public static void main(String[] args) {
       Tea myTea = new SimpleTea(20);
       myTea.price();

     //   myTea = new MilkTeaDecorator(new SimpleTea(25),10);
        myTea = new JasmineTeaDecorator(new SimpleTea(20));
       myTea.price();
    }
}
