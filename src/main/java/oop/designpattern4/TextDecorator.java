package oop.designpattern4;

import java.util.Objects;

public abstract class TextDecorator implements TextProcessor {
//aggregation. lifecycle of textProcessor is not controlled by
// TextDecorator
    private TextProcessor textProcessor;

    protected TextDecorator(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

   /* @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();*/

    @Override
    public String out() {
        //out2 is used to demonstrate default methods in Interface
        //textProcessor.out2();
        return textProcessor.out();
    }
}
