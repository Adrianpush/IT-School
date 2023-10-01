package session10_inheritance_encapsulation.homework.bank_account_management;

import java.util.UUID;

public class BankAccount {

    String accountHolderFirstName;
    String accountHolderLastName;
    UUID accountNumber;
    double balance;
    final double zero = 0;

    public BankAccount(String accountHolderFirstName, String accountHolderLastName) {
        this.accountHolderFirstName = accountHolderFirstName;
        this.accountHolderLastName = accountHolderLastName;
        this.accountNumber = UUID.randomUUID();
        this.balance = zero;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountDetails() {
        return "Account holder name: " + accountHolderFirstName + " " + accountHolderLastName +  "\n" +
                "Account number: " + accountNumber;
    }

    public void deposit(double amount) {
        if (amount > zero) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > zero) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    public void transferFunds(BankAccount targetAccount, double amount) {
        if (amount > zero && amount <= balance) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
        }
    }
}
