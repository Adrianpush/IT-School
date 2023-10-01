package session17_streams.homework;

import java.util.Arrays;
import java.util.List;

public class FindAdults {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", "Johnson", 20),
                new Person("Bob", "Smith", 17)
        );
        printAdults(people);
    }

    /**
     * Given a list of people with attributes: first name, last name, and age;
     * use streams to find all people who are older than 18 years.
     * class Person {      * String firstName;      * String lastName;      * int age;      * }
     *
     * @param people - List of person objects
     *               List<Person> people =
     *               Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));
     */
    private static void printAdults(List<Person> people) {
        System.out.println(people.stream().filter(person -> person.getAge() >= 18).toList());
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}