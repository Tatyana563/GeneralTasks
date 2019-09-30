package oop.designpattern4;

public class ReverseTextDecorator extends TextDecorator {

    public ReverseTextDecorator(TextProcessor textProcessor) {
        super(textProcessor);
    }



    @Override
    public String out() {

        String str = super.out();
        /*String str2 = "";
        for (int i = str.length()-1; i >=0; i--) {
            str2 = str2 + str.charAt(i);
        }*/
        System.out.println(str+"ggg");
       return new StringBuilder(str).reverse().toString();

    }
}
