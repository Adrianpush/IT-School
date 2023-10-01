package session15_hashcode_equals_generics.homework.challenge3;

// Create a Student class with name, age, studentId, and email fields.
// Implement the equals() method to check all fields except the studentId.
// Implement the hashCode() method to use all fields except the studentId to calculate the hash code.
// Test that two instances with the same name, age, and email return true for equals() and have the same hash code.

import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;

public class Student {

    private String name;
    private int age;
    private UUID studentID;
    private String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.studentID = UUID.randomUUID();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alfred", 22, "@");
        Student student2 = new Student("Butler", 21, "@");
        Student student3 = new Student("Butler", 21, "@");

        System.out.println(student1.equals(student1));
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));

        HashSet<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }
}
