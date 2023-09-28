package session17.homework;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        printSumIntArray(numbers);
    }

    /**
     * Create a stream of integers from an array and find the sum of all integers using the reduce method.
     *
     * @param numbers - (Input: Integer[] numbers = {1, 2, 3, 4, 5});
     */
    private static void printSumIntArray(Integer[] numbers) {
        System.out.println(Arrays.stream(numbers).reduce(Integer::sum).orElse(0));
    }
}
