package session13.homework.library_management;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private final String title;
    private final List<Author> authorList;
    private String publisher;
    private String isbn;
    private String bookInformation;

    public Book(String title, List<Author> authorList) {
        this.title = title;
        this.authorList = authorList;
    }

    public Book(String title, Author author) {
        this.title = title;
        this.authorList = new ArrayList<>();
        authorList.add(author);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public String getBookInformation() {
        return bookInformation;
    }

    public void setBookInformation(String bookInformation) {
        this.bookInformation = bookInformation;
    }
}
