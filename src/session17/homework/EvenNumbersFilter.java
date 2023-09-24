package session17.homework;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersFilter {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        printEvenNumbers(numbers);
    }

    /**
     * Given a list of integers, create a new list that contains only the even numbers.
     * Use streams to achieve this.
     * (Input: List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);)
     **/
    private static void printEvenNumbers(List<Integer> numbers) {
        System.out.println(numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList());
    }
}
