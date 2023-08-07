package session4.livepractice;

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
        if (num > 0 ) {
            System.out.println("Number is positive.");
        } else if (num < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }
    }

    public static void nestedStatements(){
        String name = "Ioana";
        String city = "Cluj";
        String sex = "f";
        int age = 20;

        if (city.equals("Cluj") && sex.equals("f") && age == 20){
            System.out.println(name);
        }
    }
}
