package session9_oopconcepts.homework.banking_application;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {

    LocalDateTime transactionDateTime;
    UUID transactionID;
    double amount;
    TransactionType transactionType;
    TransactionStatus transactionStatus;

    public Transaction(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionID = UUID.randomUUID();
        this.transactionDateTime = LocalDateTime.now();
        this.transactionStatus = TransactionStatus.PENDING;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public UUID getTransactionID() {
        return transactionID;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionDateTime=" + transactionDateTime +
                ", transactionID=" + transactionID +
                ", amount=" + amount +
                ", transactionType=" + transactionType +
                ", transactionStatus=" + transactionStatus +
                '}';
    }
}
