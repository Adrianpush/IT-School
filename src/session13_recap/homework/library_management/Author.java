package session13_recap.homework.library_management;

import java.time.LocalDate;

public class Author {

    private final String name;
    private String nationality;
    private LocalDate birthday;
    private String authorInformation;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAuthorInformation() {
        return authorInformation;
    }

    public void setAuthorInformation(String authorInformation) {
        this.authorInformation = authorInformation;
    }
}
