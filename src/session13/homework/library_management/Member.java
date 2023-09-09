package session13.homework.library_management;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Member {

    private String firstName;
    private String lastName;
    private String address;
    private AccountStatus accountStatus;
    private HashMap<Book, LocalDateTime> borrowedBooks;

    public Member(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.accountStatus = AccountStatus.GREEN;
        this.borrowedBooks = new HashMap<>();
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected AccountStatus getAccountStatus() {
        return accountStatus;
    }

    protected void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    protected HashMap<Book, LocalDateTime> getBorrowedBooks() {
        return borrowedBooks;
    }

    protected void setBorrowedBooks(HashMap<Book, LocalDateTime> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    protected void borrowBook(Book book, Duration duration) {
        borrowedBooks.put(book, LocalDateTime.now().plus(duration));
    }

    protected void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    protected boolean hasLateBook(Member member) {
        for (Book book : member.getBorrowedBooks().keySet()) {
            LocalDateTime bookReturnDate = member.getBorrowedBooks().get(book);
            if (bookReturnDate.isBefore(LocalDateTime.now())) {
                return true;
            }
        }
        return false;
    }
}
