package session5_advancedflowcontrol.homework;

public class PrintFibonacciNumbers {

    public static void main(String[] args) {
        printFibonacciNumbers(UserInput.getValidInt("How many numbers in the Fibonacci series" +
                " would you like to print? \n"));
    }

    /**
     * Write a program that generates and prints the first n numbers of the Fibonacci series,
     * where n is provided by the user.
     */
    public static void printFibonacciNumbers(int upperBound) {
        long beforePrevious = 0;
        long previous = 1;
        long count = 0;
        while (count < upperBound) {
            long nextFibonacciNum = beforePrevious + previous;
            beforePrevious = previous;
            previous = nextFibonacciNum;
            System.out.println(nextFibonacciNum);
            count++;
        }
    }
}