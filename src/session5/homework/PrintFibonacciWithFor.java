package session5.homework;

public class PrintFibonacciWithFor {

    public static void main(String[] args) {
        printFirstTenFibonacciNumbers();
    }

    /**
     * Write a program that prints the first 10 numbers in the Fibonacci series.
     * Use a for loop to accomplish this.
     */
    public static void printFirstTenFibonacciNumbers() {
        int beforePrevious = 0;
        int previous = 1;
        System.out.println(beforePrevious);
        System.out.println(previous);
        for (int count = 0; count < 8; count++) {
            int fibonacciNumber = beforePrevious + previous;
            System.out.println(fibonacciNumber);
            beforePrevious = previous;
            previous = fibonacciNumber;
        }
    }
}
