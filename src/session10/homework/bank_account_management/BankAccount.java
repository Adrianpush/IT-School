package session10.homework.bank_account_management;

import java.util.UUID;

public class BankAccount {

    String accountHolderName;
    UUID accountNumber;
    double balance;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = UUID.randomUUID();
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountDetails() {
        return "Account holder name: " + accountHolderName + "\n" +
                "Account number: " + accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    public void transferFunds(BankAccount targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
        }
    }
}
