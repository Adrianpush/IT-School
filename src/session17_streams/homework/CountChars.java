package session17_streams.homework;

import java.util.Arrays;
import java.util.List;

public class CountChars {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
        countChars(strings);
    }

    /**
     * Using streams, find the total number of characters across a list of strings excluding whitespace characters.
     *
     * @param strings - (Input: List<String> strings =
     *                Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)
     */
    private static void countChars(List<String> strings) {
        System.out.println(
                strings.stream()
                        .flatMapToInt(String::chars)
                        .filter(c -> c != ' ')
                        .count()
        );
    }
}
