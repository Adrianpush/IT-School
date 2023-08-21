package session8.homework;

import java.util.Random;

public class OddOrEven {

    public static void main(String[] args) {
        Random random = new Random();
        int[] tenIntegers = new int[10];
        for (int index = 0; index < tenIntegers.length; index++) {
            tenIntegers[index] = random.nextInt(101);
        }
        countOddAndEven(tenIntegers);
    }

    public static void countOddAndEven(int[] ints) {
        int oddCount = 0;
        int evenCount = 0;
        for (Integer integer : ints) {
            if (integer % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The array contains " + evenCount + " even numbers and " +
                oddCount + " odd numbers.");
    }
}
