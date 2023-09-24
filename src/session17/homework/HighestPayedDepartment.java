package session17.homework;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPayedDepartment {

    public static void main(String[] args) {
        Random random = new Random();
        List<Employee> employees = Arrays.asList(
                new Employee("John", Department.ACCOUNTING, random.nextDouble(100)),
                new Employee("Maria", Department.MARKETING, random.nextDouble(100)),
                new Employee("Joanne", Department.DEVELOPEMENT, random.nextDouble(100)),
                new Employee("Martin", Department.DEVELOPEMENT, random.nextDouble(100)),
                new Employee("Garcia", Department.MARKETING, random.nextDouble(100))
        );
        System.out.println(findHighestPaid(employees).orElseThrow());


    }

    /**
     * Given a list of employee objects with attributes: name, department, and salary;
     * find the department with the highest total salary.
     * @param employees - List of Employee objects
     * @return
     */
    private static Optional<Department> findHighestPaid(List<Employee> employees) {
        Optional<Map.Entry<Department, Double>> highestPaid = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        return highestPaid.map(Map.Entry::getKey);
    }
}

class Employee {

    String name;
    Department department;
    double salary;

    public Employee(String name, Department department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

enum Department {
    ACCOUNTING, DEVELOPEMENT, MARKETING;
}
