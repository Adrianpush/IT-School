package session17.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFromFile {

    public static void main(String[] args) throws IOException {
        String filePath = "src/session17/homework/textfile.txt";
        String longestWord = findLongestWordFromFile(filePath).orElse("");
        System.out.println(longestWord);
    }

    /**
     * Create a stream from a text file and use stream operations to find and print the longest word in the file.
     * @param filePath - String of file location
     * @return
     */
    public static Optional<String> findLongestWordFromFile(String filePath) {
        Optional<String> result;
        try (Stream<String> stringStream = Files.lines(Paths.get(filePath))) {
            result = stringStream
                    .flatMap(string -> Arrays.stream(string.split(" ")))
                    .map(word -> word.replaceAll("[^a-zA-Z]", ""))
                    .max(Comparator.comparingInt(String::length));
        } catch (IOException ioException) {
            result = Optional.empty();
        }
        return result;
    }
}
