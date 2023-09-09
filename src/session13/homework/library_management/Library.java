package session13.homework.library_management;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Library {

    private String libraryName;
    private HashMap<Book, Integer> books;
    private HashSet<Member> memberList;
    private int maximumLendingDays = 30;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new HashMap<>();
        this.memberList = new HashSet<>();
    }

    public void setMaximumLendingDays(int maximumLendingDays) {
        this.maximumLendingDays = maximumLendingDays;
    }

    public void addBook(Book book) {
        if (books.containsKey(book)) {
            books.put(book, books.get(book) + 1);
        } else {
            books.put(book, 1);
        }
    }

    public void addBook(Book book, int numCopies) {
        if (books.containsKey(book)) {
            books.put(book, books.get(book) + numCopies);
        } else {
            books.put(book, numCopies);
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books.keySet()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByAuthorName(String authorName) {
        for (Book book : books.keySet()) {
            for (Author author : book.getAuthorList()) {
                if (author.getName().equalsIgnoreCase(authorName)) {
                    return book;
                }
            }
        }
        return null;
    }

    public Book findBookByISBN(String isbn) {
        for (Book book : books.keySet()) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void lendBook(Book book, Member member, Duration duration) {
        if (!member.hasLateBook(member) && canLend(member, book, duration)) {
            books.put(book, books.get(book) - 1);
            member.borrowBook(book, duration);
        }
    }

    public void processReturnedBook(Book book, Member member) {
        if (isRegistered(member)) {
            books.put(book, books.get(book) + 1);
            boolean isLate = member.getBorrowedBooks().get(book).isAfter(LocalDateTime.now());
            member.returnBook(book);
            if (isLate) {
                demoteMember(member);
            }
        }
    }

    public void printAllBooksTitlesAndAuthors() {
        for (Book book : books.keySet()) {
            if (isInStock(book)) {
                printBookTitleAndAuthors(book);
            }
        }
    }

    private void printBookTitleAndAuthors(Book book) {
        StringBuilder authors = new StringBuilder();
        for (Author author : book.getAuthorList()) {
            authors.append(" ").append(author.getName());
        }
        System.out.println(book.getTitle() + " by" + authors);
    }

    public void addMember(Member member) {
        this.memberList.add(member);
    }

    private boolean isRegistered(Member member) {
        return memberList.contains(member);
    }

    private boolean isInStock(Book book) {
        return books.containsKey(book) && books.get(book) > 0;
    }

    private void demoteMember(Member member) {
        if (member.getAccountStatus() == AccountStatus.GREEN) {
            member.setAccountStatus(AccountStatus.YELLOW);
        } else if (member.getAccountStatus() == AccountStatus.YELLOW) {
            member.setAccountStatus(AccountStatus.RED);
        }
    }

    private boolean canLend(Member member, Book book, Duration duration) {
        return isRegistered(member)
                && !member.getBorrowedBooks().containsKey(book)
                && member.getAccountStatus() != AccountStatus.RED
                && isInStock(book)
                && duration.minus(Duration.ofDays(maximumLendingDays)).isNegative();
    }
}
