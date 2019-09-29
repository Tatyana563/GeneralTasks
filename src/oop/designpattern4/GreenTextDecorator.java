package oop.designpattern4;

import java.nio.charset.Charset;

public class GreenTextDecorator extends TextDecorator {

    public GreenTextDecorator(TextProcessor textProcessor) {
        super(textProcessor);
    }

    @Override
    public String out() {
        return "\033[0;32m"+super.out();
    }

    public static void main(String[] args) {
        System.out.println(Charset.availableCharsets());
    }
}
