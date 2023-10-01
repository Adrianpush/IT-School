package session17_streams.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentWord {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");
        printMostFrequentWord(sentences);
    }

    /**
     * Given a list of sentences,
     * use flatMap to create a list of all words in all the sentences,
     * and then find the most frequently occurring word.
     *
     * @param sentences - (Input: List<String> sentences =
     *                  Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");)
     */
    private static void printMostFrequentWord(List<String> sentences) {
        System.out.println(
                sentences.stream()
                        .flatMap(string -> Arrays.stream(string.split(" ")))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream().max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey).orElse("")
        );
    }
}