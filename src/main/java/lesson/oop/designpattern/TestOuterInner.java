package lesson.oop.designpattern;

public class TestOuterInner {

    public static void main(String[] args) {
        // call constructor for inner static class
        //(without an object)
        //If inner is private, not public-  nothing can be called
        Outer.Inner inner = new Outer.Inner();

        // call constructor for inner class
        /*Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();*/

        //Outer.Inner inner = new Outer().new Inner();
    }
}
