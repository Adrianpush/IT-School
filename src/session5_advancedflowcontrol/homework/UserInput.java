package session5_advancedflowcontrol.homework;

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

    public static double getValidDouble(String prompt) {
        double myNum = 0;
        boolean isInputValid = false;
        Scanner scanner = new Scanner(System.in);
        while (!isInputValid) {
            System.out.println(prompt);
            String myNumString = scanner.next();
            try {
                myNum = Double.parseDouble(myNumString);
                isInputValid = true;
            } catch (NumberFormatException exception) {
                System.out.println(myNumString + " is not a valid number.");
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