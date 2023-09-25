package session17.homework;

import java.util.Arrays;
import java.util.List;

public class StringConcat {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");
        concatListOfStrings(strings);
    }

    /**
     * Given a list of strings,
     * use streams to create a single string which is a concatenation of all strings separated by a comma.
     *
     * @param strings - (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)
     */
    private static void concatListOfStrings(List<String> strings) {
        System.out.println(
                strings.stream()
                        .reduce(String::concat)
                        .orElse(""));
    }
}
