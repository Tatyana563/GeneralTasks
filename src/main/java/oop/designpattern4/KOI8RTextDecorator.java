package oop.designpattern4;

import java.nio.charset.Charset;

public class KOI8RTextDecorator extends TextDecorator{

    public KOI8RTextDecorator(TextProcessor textProcessor) {
        super(textProcessor);
    }

    @Override
    public String out() {
        return new String(
                super.out().toUpperCase().getBytes(), Charset.forName("KOI8-R"));

    }
}
