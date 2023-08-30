package session10.homework.bank_account_management;

public class BankingApp {

    public static void main(String[] args) {
        BankAccount bill = new BankAccount("Bill", "Gates");
        bill.deposit(1000);
        bill.withdraw(100);
        BankAccount jeff = new BankAccount("Jeff", "Bezos");
        jeff.deposit(300);

        System.out.println(bill.getBalance());
        System.out.println(jeff.getBalance());

        bill.transferFunds(jeff, 200);

        System.out.println(bill.getBalance());
        System.out.println(jeff.getBalance());

        System.out.println(bill.getAccountDetails());
        System.out.println(jeff.getAccountDetails());
    }
}
