package session5.homework;

public class SumNumbers {

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