package session5.homework;

import java.util.Scanner;

public class UserInput {

    private UserInput() {
    }

    public static int getValidInt(String prompt) {
        int myNum = 0;
        boolean isInputValid = false;
        Scanner scanner = new Scanner(System.in);
        while (!isInputValid) {
            System.out.println(prompt);
            String myNumString = scanner.next();
            try {
                myNum = Integer.parseInt(myNumString);
                isInputValid = true;
            } catch (NumberFormatException exception) {
                System.out.println(myNumString + " is not a valid integer.");
            }
        }
        return myNum;
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }
}