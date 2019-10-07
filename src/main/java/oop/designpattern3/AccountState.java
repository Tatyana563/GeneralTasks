package oop.designpattern3;

public interface AccountState {
    String getName();
    void put(BankAccount bankAccount, double amount, StateContext context);
    void withdraw( BankAccount bankAccount, double amount, StateContext context);
}
