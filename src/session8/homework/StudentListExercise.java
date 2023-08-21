package session8.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentListExercise {

    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        List<String> graduateStudentList = new ArrayList<>();
        studentList.add("Batman");
        studentList.add("Superman");
        studentList.add("Spider-man");
        studentList.add("Wonder woman");
        studentList.add("Silk Spectre");
        studentList.add("Winne the Poo");
        studentList.add("Joker");
        studentList.add("Hans Ulrich");
        studentList.add("Albert");
        studentList.add("Frederick");
        graduateStudentList.addAll(studentList);
        for (String student : graduateStudentList) {
            System.out.print(student + " ");
        }

    }
}
