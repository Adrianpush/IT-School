package session11.homework.banksproblem;

public class BankTwo extends Bank {

    private double balance;

    public BankTwo(double balance) {
        this.balance = balance;
    }

    @Override
    protected double getBalance() {
        return balance;
    }
}
