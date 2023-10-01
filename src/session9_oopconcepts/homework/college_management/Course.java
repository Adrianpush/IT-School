package session9_oopconcepts.homework.college_management;

import java.time.LocalDate;

public class Course {

    String courseTitle;
    String courseDescription;
    Professor courseProfessor;
    LocalDate courseStartDate;
    int numberOfSessions;

    public Course(String courseTitle, String courseDescription, int numberOfSessions) {
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.numberOfSessions = numberOfSessions;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public Professor courseProfessor() {
        return courseProfessor;
    }

    public LocalDate getCourseStartDate() {
        return courseStartDate;
    }

    public int getNumberOfSessions() {
        return numberOfSessions;
    }

    public void courseProfessor(Professor courseProfessor) {
        this.courseProfessor = courseProfessor;
    }

    public void setCourseStartDate(LocalDate courseStartDate) {
        this.courseStartDate = courseStartDate;
    }
}
