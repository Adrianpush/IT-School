package session8.homework;

import java.util.LinkedList;
import java.util.List;

public class RemoveStudentFromLinkedList {

    public static void main(String[] args) {
        List<String> studentList = new LinkedList<>();
        studentList.add("Yoda");
        studentList.add("Obi Wan");
        studentList.add("Jar-Jar Binks");
        studentList.add("Mace Windu");

        removeStudent(studentList, "Yoda");
        System.out.println(studentList);
    }

    public static void removeStudent(List<String> students, String student) {
        for (String studentName : students) {
            if (studentName.equals(student)) {
                students.remove(student);
                break;
            }
        }
    }
}
