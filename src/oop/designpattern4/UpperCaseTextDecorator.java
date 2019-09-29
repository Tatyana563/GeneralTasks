package oop.designpattern4;

public class UpperCaseTextDecorator extends TextDecorator {

    public UpperCaseTextDecorator(TextProcessor textProcessor) {
        super(textProcessor);
    }

    @Override
    public String out() {
        return super.out().toUpperCase();
    }
}
