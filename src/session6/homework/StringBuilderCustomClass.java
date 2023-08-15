package session6.homework;

import java.util.List;

public class StringBuilderCustomClass {

    /**
     * Reverse a String
     * Description: Use the StringBuilder class to write a program that reverses an input string.
     * For example, the input "hello" should return "olleh".
     */
    public static String stringReverser(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }

    /**
     * Palindrome Checker
     * Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
     * A palindrome is a word, phrase, number,
     * or other sequences of characters that reads the same forward and backward.
     */
    public static boolean isPalindrome(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString().equals(input);
    }

    /**
     * Concatenate Multiple Strings
     * Description: Given a list of strings,
     * use StringBuilder to concatenate them into a single string efficiently.
     */
    public static String convertToSingleString(List<String> input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : input) {
            stringBuilder.append(item);
        }
        return stringBuilder.toString();
    }

    /**
     * Removing Vowels
     * Description: Create a Java program that uses the StringBuilder class
     * to remove all the vowels from an input string.
     */
    public static String removeVowels(String input) {
        String vowels = "aeiouAEIOU";
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            char letter = input.charAt(index);
            if (vowels.indexOf(letter) < 0) {
                stringBuilder.append(letter);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Word Capitalizer
     * Description: Write a program that capitalizes the first letter of every word in a sentence
     * using the StringBuilder class.
     */
    public static String toTitle(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        boolean shouldCapitalize = true;
        for (int index = 0; index < stringBuilder.length(); index++) {
            char letter = stringBuilder.charAt(index);
            if (shouldCapitalize && letter != ' ') {
                stringBuilder.replace(index, index + 1, Character.toString(letter).toUpperCase());
                shouldCapitalize = false;
            } else if (letter == ' ') {
                shouldCapitalize = true;
            }
        }
        return stringBuilder.toString();
    }

    /**
     * String Replacement
     * Description: Use the StringBuilder class to replace every occurrence of a substring within a given string
     * with another substring.
     * For instance, replace "cat" with "dog" in the string "The cat sat on the mat."
     */
    public static String replaceAllOccurrences(String oldSubstring, String newSubstring, String originalString) {
        StringBuilder stringBuilder = new StringBuilder(originalString);
        int windowSize = oldSubstring.length();
        for (int index = 0; index + windowSize < originalString.length(); index++) {
            if (stringBuilder.substring(index, index + windowSize).equals(oldSubstring)) {
                stringBuilder.replace(index, index + windowSize, newSubstring);
            }
        }
        return stringBuilder.toString();
    }
}