package session4.homework;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("aa???bbaa"));
        System.out.println(isPalindrome("bb2345aa"));
        System.out.println(isPalindrome("Sit on a potato pan, Otis"));
        System.out.println(isPalindrome("Go hang a salami, I'm a lasagna hog."));
        System.out.println(isPalindrome("Notmykindaoffirecracker."));
        System.out.println("===================================");
        System.out.println(isPalindromeEfficient("aa???bbaa"));
        System.out.println(isPalindromeEfficient("bb2345aa"));
        System.out.println(isPalindromeEfficient("Sit on a potato pan, Otis"));
        System.out.println(isPalindromeEfficient("Go hang a salami, I'm a lasagna hog."));
        System.out.println(isPalindromeEfficient("Notmykindaoffirecracker."));
    }

    public static boolean isPalindrome(String stringToBeChecked) {
        stringToBeChecked = stringToBeChecked.replaceAll("[^A-Za-z0-9]", "");
        stringToBeChecked = stringToBeChecked.toLowerCase();
        int lenString = stringToBeChecked.length();
        int halfLen = lenString / 2;
        for (int i = 0; i < halfLen; i++) {
            if (stringToBeChecked.charAt(i) != stringToBeChecked.charAt(lenString - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeEfficient(String stringToBeChecked) {
        String alphaNumericString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        List<Character> charList = new ArrayList<>();
        for (char character : stringToBeChecked.toCharArray()) {
            if (alphaNumericString.indexOf(character) > -1) {
                charList.add(Character.toLowerCase(character));
            }
        }
        for (int i = 0; i < (charList.size() / 2); i++) {
            if (!charList.get(i).equals(charList.get(charList.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
