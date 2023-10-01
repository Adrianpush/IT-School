package session9_oopconcepts.homework.school_gradebook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {

    private String name;
    private UUID STUDENT_ID;
    private List<Double> grades;

    public Student(String name) {
        this.name = name;
        this.STUDENT_ID = UUID.randomUUID();
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return STUDENT_ID;
    }

    public List<Double> getGrades() {
        return grades;
    }
}
