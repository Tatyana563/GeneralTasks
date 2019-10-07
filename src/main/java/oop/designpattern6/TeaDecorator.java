package oop.designpattern6;

import java.util.PrimitiveIterator;

public abstract class TeaDecorator implements Tea {
    private Tea tea;

    public TeaDecorator(Tea tea) {
        this.tea = tea;
    }

    @Override
    public int price() {
        return tea.price();
    }
}
