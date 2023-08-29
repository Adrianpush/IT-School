package session9.homework.banking_application;

import java.util.concurrent.TimeUnit;

public class BankingApplication {

    public static void main(String[] args) throws InterruptedException {
        BankAccount myBankAccount = new BankAccount("Adrian", "Push", 20);
        TimeUnit.SECONDS.sleep(1);
        BankAccount scamBankAccount = new BankAccount("Money", "Thief", -5);
        TimeUnit.SECONDS.sleep(1);

        myBankAccount.processTransaction(200, TransactionType.WITHDRAW);
        TimeUnit.SECONDS.sleep(1);
        myBankAccount.processTransaction(100, TransactionType.DEPOSIT);
        TimeUnit.SECONDS.sleep(1);
        myBankAccount.processTransaction(50, TransactionType.DEPOSIT);
        TimeUnit.SECONDS.sleep(1);
        myBankAccount.processTransaction(100, TransactionType.WITHDRAW);

        scamBankAccount.processTransaction(1000000, TransactionType.DEPOSIT);
        TimeUnit.SECONDS.sleep(1);
        scamBankAccount.processTransaction(2000000, TransactionType.WITHDRAW);

        System.out.println("My account");
        for (Transaction transaction : myBankAccount.getRecentTransactions(20)) {
            System.out.println(transaction);
        }
        System.out.println("Account balance: " + myBankAccount.getBalance());
        System.out.println("Scam account");
        for (Transaction transaction : scamBankAccount.getRecentTransactions(20)) {
            System.out.println(transaction);
        }
        System.out.println("Account balance: " + scamBankAccount.getBalance());
    }
}
