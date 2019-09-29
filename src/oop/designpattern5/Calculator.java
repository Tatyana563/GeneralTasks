package oop.designpattern5;

public class Calculator {

    private Strategy strategy;

    /*public Calculator() {
        strategy = new MultiplyStrategy();
    }*/

    private Number value;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calculate(Number value1, Number value2) {
        System.out.println(strategy.execute(value1, value2));
    }
}
