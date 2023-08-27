package session9.homework.college_management;

import java.time.LocalDate;

public class CollegeMember {

    private String firstName;
    private String lastName;
    private String sex;
    private final String CNP;
    private LocalDate dateOfBirth;

    private String address;

    public CollegeMember(String firstName, String lastName, String numericalIdentifier, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNP = numericalIdentifier;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCNP() {
        return CNP;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
