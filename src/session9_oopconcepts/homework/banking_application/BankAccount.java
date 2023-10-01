package session9_oopconcepts.homework.banking_application;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BankAccount {

    private String firstName;
    private String lastName;
    private UUID accountOwnerID;
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(String firstName, String lastName, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountOwnerID = UUID.randomUUID();
        this.transactions = new ArrayList<>();
        if (initialDeposit > 0) {
            deposit(initialDeposit);
        } else {
            deposit(0);
        }
    }

    public void processTransaction(double amount, TransactionType transactionType) {
        if (transactionType.equals(TransactionType.DEPOSIT)) {
            deposit(amount);
        } else if (transactionType.equals(TransactionType.WITHDRAW)) {
            withdraw(amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getRecentTransactions(LocalDateTime start, LocalDateTime end) {
        List<Transaction> recentTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionDateTime().isAfter(start) &&
                    transaction.getTransactionDateTime().isBefore(end)) {
                recentTransactions.add(transaction);
            }
        }
        return recentTransactions;
    }

    public List<Transaction> getRecentTransactions(LocalDateTime start) {
        List<Transaction> recentTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionDateTime().isAfter(start)) {
                recentTransactions.add(transaction);
            }
        }
        return recentTransactions;
    }

    public List<Transaction> getRecentTransactions(int numberOfTransactions) {
        List<Transaction> recentTransactions = new ArrayList<>();
        for (int index = transactions.size() - 1;
             index >= Math.max(0, transactions.size() - numberOfTransactions - 1);
             index--) {
            recentTransactions.add(transactions.get(index));
        }
        return recentTransactions;
    }

    private void deposit(double amount) {
        Transaction transaction = new Transaction(amount, TransactionType.DEPOSIT);
        if (amount >= 0) {
            balance += amount;
            transaction.setTransactionStatus(TransactionStatus.PROCESSED);
        } else {
            transaction.setTransactionStatus(TransactionStatus.DENIED);
        }
        transactions.add(transaction);

    }

    private void withdraw(double amount) {
        Transaction transaction = new Transaction(amount, TransactionType.WITHDRAW);
        if (amount >= 0 && balance >= amount) {
            balance -= amount;
            transaction.setTransactionStatus(TransactionStatus.PROCESSED);
        } else {
            transaction.setTransactionStatus(TransactionStatus.DENIED);
        }
        transactions.add(transaction);
    }
}
