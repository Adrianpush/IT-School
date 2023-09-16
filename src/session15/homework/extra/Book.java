package session15.homework.extra;

public class Book implements Rating{

    String name;
    String author;
    int numPages;
    int rating;

    public Book(String name, String author, int numPages, int rating) {
        this.name = name;
        this.author = author;
        this.numPages = numPages;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
