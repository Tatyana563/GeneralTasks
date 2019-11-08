package oop.designpattern11_wiki;

public class LiquidState implements State {
    private static final String NAME = "liquid";

    public String getName() {
        return NAME;
    }

    public void freeze(StateContext context) {
        context.setState(new SolidState());
    }

    public void heat(StateContext context) {
        context.setState(new GaseousState());
    }
}
