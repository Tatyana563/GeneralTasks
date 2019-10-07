package oop.designpattern3;

public class OverdraftState implements AccountState {
    private static final String name = "overdraft";

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
        bankAccount.balance = bankAccount.balance - amount;
        if (bankAccount.balance < -5000) {
            context.setState(new BlockedState());
        }
    }
}
