package oop.designpattern11_wiki;

public interface State {
    String getName();
    void freeze(StateContext context);
    void heat(StateContext context);
}

