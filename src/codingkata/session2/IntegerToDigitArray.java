package codingkata.session2;

import java.util.ArrayList;
import java.util.List;

public class IntegerToDigitArray {

    public static void main(String[] args) {
        int number = 12345;
        int[] digits = digitsToArray(number);
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }

    public static int[] digitsToArray(int number){
        int numberLength = String.valueOf(number).length();
        int[] digits = new int[numberLength];
        for (int index = numberLength - 1; index >= 0; index--){
            digits[index] = number % 10;
            number /= 10;
        }
        return digits;
    }
}
