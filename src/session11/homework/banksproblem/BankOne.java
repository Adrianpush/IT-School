package session11.homework.banksproblem;

public class BankOne extends Bank {

    private double balance;

    public BankOne(double balance) {
        this.balance = balance;
    }

    @Override
    protected double getBalance() {
        return balance;
    }
}
