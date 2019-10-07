package oop.designpattern6;

public class BerriesTeaDecorator extends TeaDecorator{
    private final int berryPrice;

    public BerriesTeaDecorator(Tea tea, int berryPrice) {
        super(tea);
        this.berryPrice = berryPrice;
    }

    @Override
    public int price() {
        int price=super.price()+berryPrice;
        System.out.println("Price: Tea with berries "+price);
        return price;
    }
}

