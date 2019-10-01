package oop.designpattern6;

public class CinnamonTeaDecorator extends TeaDecorator{
    private final int cinnamonPrice;

    public CinnamonTeaDecorator(Tea tea, int cinnamonPrice) {
        super(tea);
        this.cinnamonPrice = cinnamonPrice;
    }

    @Override
    public int price() {
        int price=super.price()+cinnamonPrice;
        System.out.println("Price: Tea with cinnamon "+price);
        return price;
    }
}
