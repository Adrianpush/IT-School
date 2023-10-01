package session9_oopconcepts.homework.college_management;

import java.time.LocalDate;

public class Student extends CollegeMember {

    public Student(String firstName, String lastName, String numericalIdentifier, LocalDate dateOfBirth) {
        super(firstName, lastName, numericalIdentifier, dateOfBirth);
    }


}
