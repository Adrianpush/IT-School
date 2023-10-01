package session4_decision_constructs.livepractice;

public class JavaStatements {

    public static void main(String[] args) {
        int currentYear = 2023;
        int birthday = 1990;
        int age = currentYear - birthday;
        System.out.println("Age is: " + age);

        if (age >= 50) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        int num = 0;
        if (num > 0) {
            System.out.println("Number is positive.");
        } else if (num < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        nestedStatements();
    }
    public static void nestedStatements() {
        String name = "Ioana";
        String city = "B";
        String sex = "b";
        int age = 21;

        if (city.equals("Cluj") && sex.equals("f") || age == 21) {
            System.out.println(name);
        }
    }
}
