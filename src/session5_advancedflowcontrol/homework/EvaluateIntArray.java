package session5_advancedflowcontrol.homework;

public class EvaluateIntArray {

    public static void main(String[] args) {
        int[] myIntArray = {10, 5, 12, 1, -132, 19, 23, 1, 1};
        evaluateOddOrEven(myIntArray);
    }

    /**
     * Given an array of integers, write a program that prints each number in the array
     * followed by "Even" if the number is even, or "Odd" if the number is odd.
     * Utilize a for-each loop for this task.
     */
    public static void evaluateOddOrEven(int[] inputArray) {
        for (int number : inputArray) {
            String message = number % 2 == 0 ? " is Even." : " is Odd.";
            System.out.println(number + message);
        }
    }
}
