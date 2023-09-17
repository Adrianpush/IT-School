package session15.homework.xml_to_json;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("book")
public class Book {
    private String title;
    private String author;

    // getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}