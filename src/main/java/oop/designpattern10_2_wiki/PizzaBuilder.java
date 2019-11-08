package oop.designpattern10_2_wiki;

abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza; }
    public void createNewPizzaProduct() {
        pizza = new Pizza(); }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}

