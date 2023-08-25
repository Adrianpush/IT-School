package session9.homework.CollegeManagement;

import java.time.LocalDate;

public class Professor extends CollegeMember {

    public Professor(String firstName, String lastName, String numericalIdentifier, LocalDate dateOfBirth) {
        super(firstName, lastName, numericalIdentifier, dateOfBirth);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getSex() {
        return super.getSex();
    }

    @Override
    public LocalDate getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public String getCNP() {
        return super.getCNP();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setSex(String sex) {
        super.setSex(sex);
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }
}
