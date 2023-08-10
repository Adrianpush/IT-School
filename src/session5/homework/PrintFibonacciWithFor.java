package session5.homework;

public class PrintFibonacciWithFor {

    public static void main(String[] args) {
        printFirstTenFibonacciNumbers();
    }

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
