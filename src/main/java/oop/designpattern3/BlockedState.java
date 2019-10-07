package oop.designpattern3;

public class BlockedState implements AccountState {
    private static final String name= "blocked";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void put(BankAccount bankAccount, double amount, StateContext context) {
        System.out.println("NOTHING HAPPENS");
    }

    @Override
    public void withdraw(BankAccount bankAccount, double amount, StateContext context) {
        System.out.println("Account is blocked,money is not available");
    }
}
