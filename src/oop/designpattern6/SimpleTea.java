package oop.designpattern6;

public class SimpleTea implements Tea {
    private final int teaPrice;

    public SimpleTea(int teaPrice) {
        this.teaPrice = teaPrice;
    }

    @Override
    public int price() {
        System.out.println("Price: simple tea");
        return teaPrice;
    }
}
