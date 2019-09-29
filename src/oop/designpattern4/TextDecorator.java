package oop.designpattern4;

public abstract class TextDecorator implements TextProcessor {
//aggregation. lifecycle of textProcessor is not controlled by
// TextDecorator
    private TextProcessor textProcessor;

    protected TextDecorator(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    @Override
    public String out() {
        return textProcessor.out();
    }
}
