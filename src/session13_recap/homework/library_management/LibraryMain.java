package session13_recap.homework.library_management;

import java.time.Duration;

public class LibraryMain {

    public static void main(String[] args) {
        Library myLibrary = new Library("Continuum");
        Author isaacAsimov = new Author("Isaac Asimov");
        Book bookOne = new Book("Foundation", isaacAsimov);
        myLibrary.addBook(bookOne , 1);
        myLibrary.addBook(new Book("Robots", isaacAsimov));
        myLibrary.printAllBooksTitlesAndAuthors();
        Member aMember = new Member("Liam", "Nelson", "Hollywood");
        myLibrary.addMember(aMember);
        myLibrary.lendBook(bookOne, aMember, Duration.ofDays(20));
        myLibrary.printAllBooksTitlesAndAuthors();
        myLibrary.processReturnedBook(bookOne, aMember);
        myLibrary.printAllBooksTitlesAndAuthors();
    }
}
