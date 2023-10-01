package session15_hashcode_equals_generics.live;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashcodePractice {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("Alice");
        emp1.setDepartment("IT");

        Employee emp2 = new Employee();
        emp2.setId(1);
        emp2.setName("Alice");
        emp2.setDepartment("IT");

        System.out.println("Emp1 equals emp2 is " + emp1.equals(emp2));

        Set<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        System.out.println("".concat(String.valueOf(employees.size())));
    }
}
