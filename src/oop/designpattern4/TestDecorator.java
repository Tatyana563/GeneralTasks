package oop.designpattern4;

public class TestDecorator {

    public static void main(String[] args) {
//anonymous class which is extended from abstract
        TextDecorator td = new TextDecorator(new SimpleTextProcessor("sfdfsds")) {
            @Override
            public String out() {
                return super.out();

            }

    };
        TextProcessor textProcessor = new SimpleTextProcessor("Hello world!!!");
        System.out.println(textProcessor.out());

        textProcessor = new UpperCaseTextDecorator(new SimpleTextProcessor("Hello world!!!"));
        System.out.println(textProcessor.out());

        textProcessor = new ReverseTextDecorator(new UpperCaseTextDecorator(new SimpleTextProcessor("Hello world!!!!")));
        System.out.println(textProcessor.out());

        textProcessor = new KOI8RTextDecorator(new UpperCaseTextDecorator(new SimpleTextProcessor("Привет")));
        System.out.println(textProcessor.out());

        textProcessor = new GreenTextDecorator(new UpperCaseTextDecorator(new SimpleTextProcessor("Привет")));
        System.out.println(textProcessor.out());


    }
}
