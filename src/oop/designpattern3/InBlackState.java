package oop.designpattern3;

public class InBlackState implements AccountState {
    private static final String name = "inblackstate";
    @Override
    public String getName() {
        return name;
    }


    @Override
    public void put(BankAccount bankAccount, double amount, StateContext context) {
        System.out.println("Money added, state isn't changed");
    }

    @Override
        public void withdraw(BankAccount bankAccount, double amount, StateContext context) {
            bankAccount.balance = bankAccount.balance-amount;
            if(bankAccount.balance<amount){
                context.setState( new OverdraftState());
            }
    }
}
