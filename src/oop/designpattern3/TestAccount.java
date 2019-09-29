package oop.designpattern3;

public class TestAccount {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1,"Mary",500);
        StateContext context = new StateContext();
       context.put(ba,100);
        context.withdraw(ba,700);

    }
}
