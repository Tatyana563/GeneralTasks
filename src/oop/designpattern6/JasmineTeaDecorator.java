package oop.designpattern6;

public class JasmineTeaDecorator extends TeaDecorator {
  private final int jasminePrice=10;

    public JasmineTeaDecorator(Tea tea) {
        super(tea);
    }

    @Override
    public int price() {
        int price=super.price()+jasminePrice;
        System.out.println("Price: tea with jasmine is "+price);
        return price;
    }

}
