package oop.designpattern4;

public class SimpleTextProcessor implements TextProcessor {

    private final String text;

    public SimpleTextProcessor(String text) {
        this.text = text;
    }

    @Override
    public String out() {
        return text;
    }
}
