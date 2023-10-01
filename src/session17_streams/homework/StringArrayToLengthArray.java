package session17_streams.homework;

import java.util.Arrays;
import java.util.List;

public class StringArrayToLengthArray {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");
        printLetterCount(strings);
    }

    /**
     * Use streams to transform a list of strings into a list of their respective lengths.
     *
     * @param strings - (Input: List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");)
     */
    private static void printLetterCount(List<String> strings) {
        System.out.println(strings.stream().map(String::length).toList());
    }
}