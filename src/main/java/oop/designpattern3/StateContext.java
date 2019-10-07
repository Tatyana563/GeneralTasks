package oop.designpattern3;

public class StateContext {
    private AccountState state = new InBlackState();

    public void put(BankAccount bankAccount, double amount){
        System.out.println("Adding money, stateis :"+state.getName());
        state.put(bankAccount,amount,this);
        bankAccount.balance = bankAccount.balance+amount;
        System.out.println("Balance is:"+bankAccount.balance);
    }
    public void withdraw(BankAccount bankAccount, double amount){
        System.out.println("getting money"+state.getName());
        state.withdraw(bankAccount,amount,this);
    }
    public void setState(AccountState state){
        System.out.println("Changing state to"+state.getName());
        this.state=state;
    }
    public AccountState getState(){
        return state;
    }

}
