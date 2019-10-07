package oop.designpattern5;

public class Calculator {
//aggregation, class Calculator doesn't control lifecycle of strategy;
    private Strategy strategy;
// example of composition
    /*public Calculator() {
        strategy = new MultiplyStrategy();
    }*/
//REMEMBER:
    //room+wall=composition;
    //room+furniture=aggregation;
    //Strategy instead of State  = doesn't provide link this;(ссылку на объект)
    private Number value;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calculate(Number value1, Number value2) {
        System.out.println(strategy.execute(value1, value2));
    }
}
