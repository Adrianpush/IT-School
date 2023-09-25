package session17.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookFilter {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Leviathan Wakes", "Corey", 2018),
                new Book("Cibola Burn", "Corey", 2022),
                new Book("Dune", "Herbert", 1980),
                new Book("A game of thrones", "Martin", 1996),
                new Book("A dance of dragons", "Martin", 2006)
        );
        System.out.println(getBooksPublishedAfter(books, 2000));
    }

    /**
     * Given a list of books with attributes: title, author, and year of publication;
     * use streams to find all the books published before the year 2000
     * and group them by author in a map where the key is the author and the value is a list of titles of their books.
     *
     * @param books - List of Book objects
     * @param year  - lower bound
     * @return
     */
    private static Map<String, List<String>> getBooksPublishedAfter(List<Book> books, int year) {
        return books.stream()
                .filter(a -> a.getYearOfPublication() >= year)
                .collect(
                        Collectors.groupingBy(
                                Book::getAuthorLastName,
                                Collectors.mapping(Book::getTitle, Collectors.toList())));
    }
}

class Book {
    String title;
    String authorLastName;
    int yearOfPublication;

    public Book(String title, String authorLastName, int yearOfPublication) {
        this.title = title;
        this.authorLastName = authorLastName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
