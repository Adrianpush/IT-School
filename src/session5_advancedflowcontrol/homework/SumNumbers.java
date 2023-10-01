package session5_advancedflowcontrol.homework;

public class SumNumbers {

    /**
     * Write a program that asks the user to enter numbers.
     * The program should continue prompting the user until they enter -1.
     * After they enter -1, print the sum of all numbers entered (excluding -1).
     */
    public static void main(String[] args) {
        boolean isRunning = true;
        int sum = 0;
        System.out.println("This programs sums numbers. Enter integers to add to the sum. \n" +
                "WARNING! For some reason -1 terminates the program and displays the total.");
        while (isRunning) {
            int userInput = UserInput.getValidInt("Please enter an integer.");
            if (userInput == -1) {
                System.out.println("The total is " + sum + ".");
                isRunning = false;
            } else {
                sum += userInput;
            }
        }
    }
}