package session5.homework;

public class AverageCalculator {

    /**
     * Write a program that prompts the user to enter numbers.
     * Calculate the average of these numbers.
     * If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.
     */
    public static void main(String[] args) {
        double average = 0;
        int numbersCount = 0;
        System.out.println("Welcome to Number Average Calculator.\nHere you can enter numbers.\n" +
                "Entering 0 displays the average of all previously entered numbers.");
        while (true) {
            double inputNumber = UserInput.getValidDouble("Enter a number.");
            if (inputNumber == 0) {
                break;
            }
            average = (average * numbersCount++ + inputNumber) / numbersCount;
        }
        System.out.println("The average of the numbers entered is " + average + ".");
    }
}