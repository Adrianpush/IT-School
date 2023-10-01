package session9_oopconcepts.homework.college_management;

import java.time.LocalDate;

public class CollegeManagementSystem {

    public static void main(String[] args) {
        CollegeMember john = new Professor("John", "Rambo", "167973",
                LocalDate.now().minusYears(30));
        john.setSex("male");
        System.out.println(john.getLastName());
        CollegeMember chuck = new Student("Chuck", "Norris", "1", LocalDate.now().minusYears(20));
        chuck.setAddress("Everywhere");
        System.out.println(chuck.getAddress());
    }
}
