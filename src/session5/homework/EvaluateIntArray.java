package session5.homework;

public class EvaluateIntArray {

    public static void main(String[] args) {
        int[] myIntArray = {10, 5, 12, 1, -132, 19, 23, 1, 1};
        evaluateOddOrEven(myIntArray);
    }

    public static void evaluateOddOrEven(int[] inputArray) {
        for (int number : inputArray) {
            String message = number % 2 == 0 ? " is Even." : " is Odd.";
            System.out.println(number + message);
        }
    }
}
