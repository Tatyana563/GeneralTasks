package oop.designpattern4;

public interface TextProcessor {

    String out();

// In Interface you can realise default method
    // it's not required to override, it can be used immediately
    //it was made in Java 8 for lambda
    default String out2(){
        return "out2";
    }
}
// class A implements Interface C.
//class B extends A.
//It is OK not to override methods of the Interface in B.
// If A is abstract, it is required for B.
// Abstract class can contain equals, hashcode when child  class uses hashset or treemap
// and override is required.