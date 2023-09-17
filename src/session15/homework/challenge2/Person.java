package session15.homework.challenge2;

//Create a Person class with name, age, and email fields.
// Implement the equals() method to check only the name and age fields.
// Implement the hashCode() method to use the name and age fields to calculate the hash code.
// Test that two instances with the same name and age return true for equals() and have the same hash code.

import java.util.Objects;

public class Person {

    String email;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Rob", 22);
        Person person2 = new Person("Liana", 29);
        Person person3 = new Person("Rob", 22);

        System.out.println(person1.equals(person1));
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
