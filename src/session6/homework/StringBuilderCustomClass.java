package session6.homework;

import java.util.HashMap;
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

    /**
     * Duplicate Character Remover
     * Description: Design a program using StringBuilder that removes duplicate characters from a string.
     * For example, "balloon" should become "balon".
     */
    public static String duplicateCharacterRemover(String input) {
        if (input.isEmpty()) {
            return input;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input.charAt(0));
        for (int index = 1; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if ((stringBuilder.charAt(stringBuilder.length() - 1) != currentChar)) {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Inserting at Index
     * Description: Write a Java program that inserts a given string into another string
     * at a specified index using the StringBuilder class.
     */
    public static String insertAtIndex(String hostString, String stringToBeInserted, int index) {
        if (index > hostString.length()) {
            index = hostString.length();
        }
        StringBuilder stringBuilder = new StringBuilder(hostString);
        stringBuilder.insert(index, stringToBeInserted);
        return stringBuilder.toString();
    }

    /**
     * Frequency Counter
     * Description: Using StringBuilder, write a program that counts the frequency of each character in a string.
     */
    public static String charFrequencyCounter(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int index = 0; index < stringBuilder.length(); index++) {
            char currentChar = input.charAt(index);
            if (counter.containsKey(currentChar)) {
                counter.put(currentChar, counter.get(currentChar) + 1);
            } else {
                counter.put(currentChar, 1);
            }
        }
        return counter.toString();
    }

    /**
     * Morse Code Converter
     * Description: Create a program that takes in a string
     * and converts it to Morse code using the StringBuilder class.
     * For simplicity, you can assume the input string only contains alphabets and numbers.
     */
    public static String morseCodeConverter(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        input = input.toUpperCase();
        HashMap<Character, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");

        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (morseCodeMap.containsKey(currentChar)) {
                stringBuilder.append(morseCodeMap.get(currentChar));
                if (index != input.length() - 1) {
                    stringBuilder.append(' ');
                }
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Encode and Decode using Caesar Cipher
     * Description: Implement a Caesar Cipher encoder and decoder using the StringBuilder class.
     * The Caesar Cipher involves rotating letters a certain number of steps down or up the alphabet.
     * For example, with a shift of 1, 'A' would be replaced by 'B', 'B' would become 'C', and so on.
     */
    public static String encodeCaesarCipher(String input, int offset) {
        StringBuilder stringBuilder = new StringBuilder();
        offset = offset % 26;
        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if ((currentChar >= 65 && currentChar <= 90)) {
                currentChar = (char) ((currentChar + offset > 90) ? currentChar + offset - 26 : currentChar + offset);
            } else if (currentChar >= 97 && currentChar <= 122) {
                currentChar = (char) ((currentChar + offset > 122) ? currentChar + offset - 26 : currentChar + offset);
            }
            stringBuilder.append(currentChar);
        }
        return stringBuilder.toString();
    }

    public static String decodeCaesarCipher(String input, int offset) {
        StringBuilder stringBuilder = new StringBuilder();
        offset = offset % 26;
        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if ((currentChar >= 65 && currentChar <= 90)) {
                currentChar = (char) ((currentChar - offset < 65) ? currentChar - offset + 26 : currentChar - offset);
            } else if (currentChar >= 97 && currentChar <= 122) {
                currentChar = (char) ((currentChar - offset < 97) ? currentChar - offset + 26 : currentChar - offset);
            }
            stringBuilder.append(currentChar);
        }
        return stringBuilder.toString();
    }

    /**
     * CamelCase to Snake_case Converter
     * Description: Write a program using StringBuilder to convert a given CamelCase string to snake_case.
     * For instance, "thisIsCamelCase" would become "this_is_camel_case".
     */
    public static String snakeCaseToCamelCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean shouldCapitalize = false;
        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (currentChar == '_') {
                shouldCapitalize = true;
            } else if (shouldCapitalize) {
                shouldCapitalize = false;
                stringBuilder.append(Character.toUpperCase(currentChar));
            } else {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }

    public static String camelCaseToSnakeCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (Character.isUpperCase(currentChar)) {
                stringBuilder.append('_');
                stringBuilder.append(Character.toLowerCase(currentChar));
            } else {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Expand Compressed Strings
     * Description: Given a compressed string like "a3b2c4",
     * expand it to "aaabbc", making use of the StringBuilder class.
     */
    public static String expandCompressedString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        StringBuilder stringMultiplier = new StringBuilder();
        while (index < input.length()) {
            char currentChar = input.charAt(index);
            if (Character.isAlphabetic(currentChar)) {
                if (!stringMultiplier.isEmpty()) {
                    int multiplier = Integer.parseInt(stringMultiplier.toString());
                    stringMultiplier.setLength(0);
                    char lastCharAppended = stringBuilder.charAt(stringBuilder.length() - 1);
                    stringBuilder.append(String.valueOf(lastCharAppended).repeat(Math.max(0, multiplier - 1)));
                } else {
                    stringBuilder.append(currentChar);
                    index++;
                }
            } else {
                stringMultiplier.append(currentChar);
                index++;
            }
        }
        if (!stringMultiplier.isEmpty()) {
            int multiplier = Integer.parseInt(stringMultiplier.toString());
            char lastCharAppended = stringBuilder.charAt(stringBuilder.length() - 1);
            stringBuilder.append(String.valueOf(lastCharAppended).repeat(Math.max(0, multiplier - 1)));
        }
        return stringBuilder.toString();
    }

    /**
     * Remove Comments from Code
     * Description: Create a Java program using StringBuilder that removes all single line and multi-line
     * comments from a provided piece of code.
     **/
    public static String removeComments(String code) {
        if (code.length() < 3) {
            return code;
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean isBlockCommentOpen = false;
        boolean isLineCommentOpen = false;
        int index = 0;
        while (index < code.length() - 1) {
            String window = code.substring(index, index + 2);
            if (!isBlockCommentOpen && !isLineCommentOpen) {
                if (window.equals("/*")) {
                    isBlockCommentOpen = true;
                } else if (window.equals("//")) {
                    isLineCommentOpen = true;
                } else {
                    stringBuilder.append(code.charAt(index));
                }
                index++;
            } else if (isBlockCommentOpen && window.equals("*/")) {
                isBlockCommentOpen = false;
                index += 2;
            } else if (isLineCommentOpen && code.charAt(index) == '\n') {
                isLineCommentOpen = false;
                index++;
            } else {
                index++;
            }
        }
        if (!isBlockCommentOpen && !isLineCommentOpen) {
            stringBuilder.append(code.substring(index));
        }
            return stringBuilder.toString();
    }

    /**
     * Anagram Checker
     * Description: Develop a program that checks if two provided strings are anagrams of each other
     * using the StringBuilder class.
     * Anagrams are words or phrases made up of the same characters.
     **/
    public static boolean areAnagrams(String phraseOne, String phraseTwo){
        StringBuilder stringBuilderPhraseOne = new StringBuilder(phraseOne);
        StringBuilder stringBuilderPhraseTwo = new StringBuilder(phraseTwo);
        for (int index = 0; index < phraseOne.length(); index++){
            String currentChar = Character.toString(phraseOne.charAt(index));
            int posInPhraseOne = stringBuilderPhraseOne.indexOf(currentChar);
            int posInPhraseTwo = stringBuilderPhraseTwo.indexOf(currentChar);
            if (posInPhraseOne < 0 || posInPhraseTwo < 0){
                return false;
            }
            stringBuilderPhraseOne.deleteCharAt(posInPhraseOne);
            stringBuilderPhraseTwo.deleteCharAt(posInPhraseTwo);
        }
        return (stringBuilderPhraseOne.isEmpty() && stringBuilderPhraseTwo.isEmpty());
    }

    /**
     * Toggling Case
     * Description: Design a program using StringBuilder that toggles the case of every character in a given string.
     * For example, "HelLo" should become "hELlO".
     **/
    public static String toggleCase(String input){
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < input.length(); index++){
            char currentChar = input.charAt(index);
            if (Character.isUpperCase(currentChar)){
                stringBuilder.append(Character.toLowerCase(currentChar));
            } else {
                stringBuilder.append(Character.toUpperCase(currentChar));
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Description: Write a program using StringBuilder that interleaves two strings.
     * For instance, given "abc" and "123", the result should be "a1b2c3".
     **/
    public static String interweaveStrings(String inputOne, String inputTwo){
        StringBuilder stringBuilder = new StringBuilder();
        String smallerString = (inputOne.length() > inputTwo.length()) ? inputTwo : inputOne;
        for (int index = 0; index < smallerString.length(); index++){
            stringBuilder.append(inputOne.charAt(index));
            stringBuilder.append(inputTwo.charAt(index));
        }
        stringBuilder.append(inputOne.substring(smallerString.length()));
        stringBuilder.append(inputTwo.substring(smallerString.length()));
        return stringBuilder.toString();
    }

    /**
     * Pattern Recognition
     * Description: Design a Java program using StringBuilder that checks if a given pattern repeats in a string.
     * For instance, given the string "ababab", the repeating pattern is "ab".
     */
    public static String findPattern(String input){
        HashMap<String, Integer> patternCount = new HashMap<>();
        for (int windowSize = 2; windowSize < input.length(); windowSize++){
            int index = 0;
            while (index + windowSize < input.length()){
                String currentWindow = input.substring(index, index + windowSize);
                if (patternCount.containsKey(currentWindow)){
                    patternCount.put(currentWindow, patternCount.get(currentWindow) + 1);
                } else {
                    patternCount.put(currentWindow, 1);
                }
                index += windowSize;
            }
        }
        String longestRepeatingString = "";
        int frequencyOfLongestRepeatingString = 2;
        String mostRepeatedString = "";
        int frequencyOfMostRepeatedString = 1;
        for (HashMap.Entry<String, Integer> entry : patternCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (key.length() >= longestRepeatingString.length() && value >= 2){
                longestRepeatingString = key;
                frequencyOfLongestRepeatingString = value;
            }
            if (value > frequencyOfMostRepeatedString){
                mostRepeatedString = key;
                frequencyOfMostRepeatedString = value;
            }
        }
        return "The longest repeating string is " + longestRepeatingString + " which repeats " +
                frequencyOfLongestRepeatingString + " times. The most repeated string is " + mostRepeatedString +
                " which repeats " + frequencyOfMostRepeatedString + " times.";
    }
    /**
     * Encode Strings with Run-Length Encoding (RLE)
     * Description: Using StringBuilder, write a program that implements the Run-Length Encoding algorithm.
     * For instance, the string "AAABBBCCDAA" would be encoded as "3A3B2C1D2A".
     */
    public static String encodeRLE(String input){
        if (input.isEmpty()){
            return input;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char lastChar = input.charAt(0);
        int lastCharIncidence = 1;
        for (int index = 1; index < input.length(); index++){
            if (input.charAt(index) != lastChar){
                stringBuilder.append(lastCharIncidence);
                stringBuilder.append(lastChar);
                lastChar = input.charAt(index);
                lastCharIncidence = 1;
            } else {
                lastCharIncidence++;
            }
        }
        stringBuilder.append(lastCharIncidence);
        stringBuilder.append(lastChar);
        return stringBuilder.toString();
    }

    /**
     * Balanced Parenthesis Checker
     * Description: Develop a program that checks
     * if a string has balanced parentheses ((, ), {, }, [, and ]) using StringBuilder.
     * The program should return true if the parentheses
     * in the string are balanced and false otherwise.
     */
    public static boolean areParenthesisBalanced(String input){
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Character, Character> parenthesisPairs = new HashMap<>();
        parenthesisPairs.put('(', ')');
        parenthesisPairs.put('{', '}');
        parenthesisPairs.put('[', ']');

        for (int index = 0; index < input.length(); index++){
            char currentChar = input.charAt(index);
            if (parenthesisPairs.containsKey(currentChar)){
                stringBuilder.append(currentChar);
            } else if (parenthesisPairs.containsValue(currentChar)){
                if (stringBuilder.isEmpty()){
                    return false;
                }
                char lastParenthesisOpened = stringBuilder.charAt(stringBuilder.length() -1);
                if (parenthesisPairs.get(lastParenthesisOpened) == currentChar){
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                } else {
                    return false;
                }
            }
        }
        return stringBuilder.isEmpty();
    }

    public static String intToRoman(int number){
        StringBuilder stringBuilder = new StringBuilder();
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        for (int index = 0; index < roman.length; index++){
            while (number >= values[index]) {
                number -= values[index];
                stringBuilder.append(roman[index]);
            }
        }
        return stringBuilder.toString();
    }
}
