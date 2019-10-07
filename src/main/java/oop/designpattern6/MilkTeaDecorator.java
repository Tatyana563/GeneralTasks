package oop.designpattern6;

public class MilkTeaDecorator extends TeaDecorator {
   private final int milkPrice;

    public MilkTeaDecorator(Tea tea, int milkPrice) {
        super(tea);
        this.milkPrice = milkPrice;
    }

    @Override
    public int price() {
        int price=super.price()+milkPrice;
        System.out.println("Price: tea with milk "+price);
        return price;
    }
}
