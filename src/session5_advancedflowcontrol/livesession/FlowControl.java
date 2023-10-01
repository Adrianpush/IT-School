package session5_advancedflowcontrol.livesession;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDSNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number (1-7) for the day of the week.");
//        int day = scanner.nextInt();

//        switch (day) {
//            case MONDAY:
//                System.out.println("Monday");
//                break;
//            case TUESDAY:
//                System.out.println("Tuesday");
//                break;
//            case WEDSNESDAY:
//                System.out.println("Wednesday");
//                break;
//            case THURSDAY:
//                System.out.println("Thursday");
//                break;
//            case FRIDAY:
//                System.out.println("Friday");
//                break;
//            case SATURDAY:
//                System.out.println("Saturday");
//                break;
//            case SUNDAY:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }
//
//        boolean gameOn = true;
//        while (gameOn){
//            gameOn = false;
//        }
//
//        do {
//            gameOn = true;
//        } while (!gameOn);
//        printNumberWithFor(10);

        List<String> list = new ArrayList<>();
        list.add("Timisoara");
        list.add("Bucuresti");
        list.add("Cluj");
        Human human = new Human();

        printListWithForEach(list);
    }

    public static void printWithWhileToNumber(int upperBound) {
        int number = 0;
        while (number <= upperBound) {
            System.out.print(number);
            number++;
        }
    }

    public static void printNumberWithDoWhile(int input) {
        int number = 1;
        do {
            System.out.println(number + ", ");
            number++;
            if (number == input) {
                System.out.println(number);
            }
        } while (number < input);

    }

    public static void printNumberWithFor(int input) {
        for (int number = 1; number <= input; number = incrementInt(number)) {
            if (number == input) {
                System.out.println(number);
            } else {
                System.out.print(number + ", ");
            }

        }
    }

    public static int incrementInt(int input) {
        return ++input;
    }

    public static void printListWithForEach(List<String> list) {
        for (String listValue : list) {
            System.out.print(listValue);
        }
    }
    public static void printListWithFor(List<String> list){
        for (int index = 0; index < list.size(); index++){

        }
    }
}
