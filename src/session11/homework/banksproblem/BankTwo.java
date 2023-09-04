package session11.homework_fun.banksproblem;

public class BankTwo extends Bank {

    private final double balance;

    public BankTwo(double balance) {
        this.balance = balance;
    }

    @Override
    protected double getBalance() {
        return balance;
    }
}
