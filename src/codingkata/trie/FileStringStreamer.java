package codingkata.trie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStringStreamer {

    public static void main(String[] args) {
        String filePath = "src/codingkata/trie/dummy.txt";

        List<String> result;
        try (Stream<String> stringStream = Files.lines(Paths.get(filePath))) {
            result = stringStream
                    .flatMap(string -> Arrays.stream(string.split(" ")))
                    .map(word -> word.replaceAll("[^a-zA-Z]", ""))
                    .collect(Collectors.toList());
        } catch (IOException ioException) {
            result = new ArrayList<>();
        }

        System.out.println(result.size());
        System.out.println(result);
    }
}
