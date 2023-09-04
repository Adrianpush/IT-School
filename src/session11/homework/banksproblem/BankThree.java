package session11.homework.banksproblem;

public class BankThree extends Bank {

    private final double balance;

    public BankThree(double balance) {
        this.balance = balance;
    }

    @Override
    protected double getBalance() {
        return balance;
    }
}
