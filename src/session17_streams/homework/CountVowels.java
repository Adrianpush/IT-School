package session17_streams.homework;

public class CountVowels {

    public static void main(String[] args) {
        String sentence = "Hello World";
        printVowelCount(sentence);
    }

    /**
     * Given a string, use streams to count the number of vowels in it.
     * @param sentence - (Input: String sentence = "Hello World";)
     */
    private static void printVowelCount(String sentence) {
        String vowels = "aeiou";
        System.out.println(sentence.chars()
                .mapToObj(c -> String.valueOf((char) c).toLowerCase())
                .filter(vowels::contains)
                .count());
    }
}
