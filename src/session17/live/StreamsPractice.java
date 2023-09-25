package session17.live;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsPractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 4, 2, 3, 4, 1);
        List<String> strings = Arrays.asList("Apple", "Banana", "Orange");

//        //Traditional Approach
//        printEvenNumbersTraditional(numbers);
//
//        //Stream Approach
//        printEvenNumbersWithStream(numbers);
//        printContainingSubstring("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium" +
//                " doloremque laudantium, totam rem aperiam," +
//                " eaque ipsa quae ab illo inventore veritatis et quasi architecto " +
//                "beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit " +
//                "aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui " +
//                "ratione voluptatem sequi nesciunt. ", "se");
//        printLengthMap(strings);
        printListOfCharacters(strings);
        char[][] hel = new char[3][3];


    }

    private static void printListOfCharacters(List<String> input) {
        List<List<Character>> chars = input.stream()
                .map(StreamsPractice::stringToCharList)
                .toList();
        System.out.println(chars);
    }

    private static List<Character> stringToCharList(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .toList();
    }


    private static void printLengthMap(List<String> input) {
        List<Integer> result = input.stream()
                .map(String::length)
                .toList();
        System.out.println(result);
    }

    private static void printContainingSubstring(String input, String substring) {
        List<String> wordsContainingSubstring = Arrays.stream(input.split(" "))
                .filter(word -> word.contains(substring))
                .toList();
        System.out.println(wordsContainingSubstring);
    }

    private static void printEvenNumbersWithStream(List<Integer> numbers) {
        List<Integer> evenNumbersFromStream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println(evenNumbersFromStream);
    }

    private static void printEvenNumbersTraditional(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);
    }
}
