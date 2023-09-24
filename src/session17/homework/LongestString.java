package session17.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        printLongestString(strings);
    }

    /**
     * Using a list of strings, find and print the longest string using Java streams.
     * (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)
     **/
    private static void printLongestString(List<String> strings) {
        System.out.println(strings.stream().max(Comparator.comparingInt(String::length)).orElse(""));
    }
}
