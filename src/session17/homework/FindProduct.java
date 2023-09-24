package session17.homework;

import java.util.Arrays;
import java.util.List;

public class FindProduct {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "a", "4", "5");
        System.out.println(getProduct(numbers));
    }

    /**
     * Using a stream of strings representing numbers (e.g., "1", "2", "3"),
     * convert them to integers and find the product of all numbers using reduce.
     *
     * @param numbers - (Input: List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");)
     * @return
     */
    private static int getProduct(List<String> numbers) {
        return numbers.stream().map(
                        number -> {
                            int result;
                            try {
                                result = Integer.parseInt(number);
                            } catch (NumberFormatException exception) {
                                result = 1;
                            }
                            return result;
                        })
                .reduce((a, b) -> a * b)
                .orElse(0);
    }
}
