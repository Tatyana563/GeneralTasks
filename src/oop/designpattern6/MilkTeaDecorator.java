package oop.designpattern6;

public class MilkTeaDecorator extends SimpleTea {
   private final int milkPrice;

    public MilkTeaDecorator(int teaPrice, int milkPrice) {
        super(teaPrice);
        this.milkPrice = milkPrice;
    }

    @Override
    public int price() {
        System.out.println("Price: tea with milk");
        return super.price()+milkPrice;
    }
}
