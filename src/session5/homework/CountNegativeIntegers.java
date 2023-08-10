package session5.homework;

public class CountNegativeIntegers {

    public static void main(String[] args) {
        int[] integerArray = {12, -2, 4, -2, -1};
        printNegativeNumbers(integerArray);
    }

    public static int printNegativeNumbers(int[] inputArray) {
        int negativeNumbersCount = 0;
        for (int number : inputArray) {
            if (number < 0) {
                negativeNumbersCount++;
            }
        }
        System.out.println("The count of negative numbers in the array is " + negativeNumbersCount + ".");
        return negativeNumbersCount;
    }
}