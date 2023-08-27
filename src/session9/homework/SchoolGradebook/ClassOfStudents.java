package session9.homework.SchoolGradebook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClassOfStudents {

    String nameOfClass;
    List<Student> students;

    public ClassOfStudents(String nameOfClass) {
        this.nameOfClass = nameOfClass;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void gradeTest(String studentName, double grade) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                gradeTest(student, grade);
            }
        }
    }

    public void gradeTest(UUID studentID, double grade) {
        for (Student student : students) {
            if (student.getUuid().equals(studentID)) {
                gradeTest(student, grade);
            }
        }
    }

    public double calculateStudentAverage(String studentName) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                return calculateStudentAverage(student);
            }
        }
        return -1;
    }

    public double calculateStudentAverage(UUID uuid) {
        for (Student student : students) {
            if (student.getUuid().equals(uuid)) {
                return calculateStudentAverage(student);
            }
        }
        return -1;
    }

    public void printStudentsInClass() {
        for (Student student : students) {
            System.out.println("Student ID: " + student.getUuid() +
                    " Student name: " + student.getName() +
                    " Grade Average " + calculateStudentAverage(student.getName()));
        }
    }

    private double calculateStudentAverage(Student student) {
        double sumGrades = 0;
        for (double grade : student.getGrades()) {
            sumGrades += grade;
        }
        return sumGrades / student.getGrades().size();
    }

    private void gradeTest(Student student, double grade) {
        student.getGrades().add(grade);
    }
}

