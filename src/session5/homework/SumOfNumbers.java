package session5.homework;

public class SumOfNumbers {
    /**
     * Create a program that asks the user for 10 numbers.
     * Print the sum of all numbers that are greater than 5.
     * If the user enters a number less than or equal to 5,
     * use the continue statement to skip the addition for that number.
     */
    public static void main(String[] args) {
        double sum = 0;
        System.out.println("After entering 10 numbers, " +
                "this program will display the sum of all entered numbers that are above 5.");
        for (int count = 0; count < 10; count++) {
            double userInput = UserInput.getValidDouble("You can enter " + (10 - count) + " numbers.");
            if (userInput <= 5) {
                continue;
            }
            sum += userInput;
//            Alternative code: sum += (userInput > 5) ? userInput : 0;
            System.out.println("The sum of all numbers above 5 is " + sum + ".");
        }
    }
}