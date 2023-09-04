package session11.homework.banksproblem;

public class Main {

    public static void main(String[] args) {
        Bank bankOne = new BankOne(100);
        Bank bankTwo = new BankTwo(150);
        Bank bankThree = new BankThree(200);
        System.out.println(bankOne.getBalance());
        System.out.println(bankTwo.getBalance());
        System.out.println(bankThree.getBalance());
    }
}
