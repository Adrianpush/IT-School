package session4_decision_constructs.homework;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {
        List<String> stringList = getListOfStrings();

        System.out.println("Running method isPalindrome.");
        long startTime = System.currentTimeMillis();
        for (String phrase : stringList) {
            isPalindrome(phrase);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Runtime is " + (endTime - startTime) + "ms.");

        System.out.println("Running method isPalindromeEfficient.");
        startTime = System.currentTimeMillis();
        for (String phrase : stringList) {
            isPalindromeEfficient(phrase);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Runtime is " + (endTime - startTime) + "ms.");

        System.out.println("Running method isPalindromeVeryEfficient.");
        startTime = System.currentTimeMillis();
        for (String phrase : stringList) {
            isPalindromeVeryEfficient(phrase);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Runtime is " + (endTime - startTime) + "ms.");
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

    public static boolean isPalindromeVeryEfficient(String stringToBeChecked) {
        int left = 0;
        int right = stringToBeChecked.length() - 1;
        char charAtLeft;
        char charAtRight;

        while (left < right) {
            charAtLeft = Character.toLowerCase(stringToBeChecked.charAt(left));
            charAtRight = Character.toLowerCase(stringToBeChecked.charAt(right));
            if (charIsInvalid(charAtLeft)) {
                left++;
            } else if (charIsInvalid(charAtRight)) {
                right--;
            } else if (charAtLeft == charAtRight) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean charIsInvalid(char charToBeChecked) {
        String alphaNumericString = "abcdefghijklmnopqrstuvwxyz0123456789";
        return alphaNumericString.indexOf(charToBeChecked) == -1;
    }

    public static List<String> getListOfStrings() {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("aa???bbaa");
        stringArrayList.add("bb2345aa");
        stringArrayList.add("Sit on a potato pan, Otis");
        stringArrayList.add("Go hang a salami, I'm a lasagna hog.");
        stringArrayList.add("radar");
        stringArrayList.add("hello");
        stringArrayList.add("level");
        stringArrayList.add("world");
        stringArrayList.add("madam");
        stringArrayList.add("openai");
        stringArrayList.add("deified");
        stringArrayList.add("programming");
        stringArrayList.add("civic");
        stringArrayList.add("arraylist");
        stringArrayList.add("stats");
        stringArrayList.add("algorithm");
        stringArrayList.add("noon");
        stringArrayList.add("computer");
        stringArrayList.add("racecar");
        stringArrayList.add("language");
        stringArrayList.add("level");
        stringArrayList.add("software");
        stringArrayList.add("redivider");
        stringArrayList.add("engineering");
        stringArrayList.add("palindrome");
        stringArrayList.add("repaper");
        stringArrayList.add("science");
        stringArrayList.add("step on no pets");
        stringArrayList.add("developer");
        stringArrayList.add("java");
        stringArrayList.add("rotor");
        stringArrayList.add("design");
        stringArrayList.add("kayak");
        stringArrayList.add("interface");
        stringArrayList.add("stats");
        stringArrayList.add("project");
        stringArrayList.add("deleveled");
        stringArrayList.add("computer");
        stringArrayList.add("level");
        stringArrayList.add("software");
        stringArrayList.add("racecar");
        stringArrayList.add("algorithm");
        stringArrayList.add("noon");
        stringArrayList.add("language");
        stringArrayList.add("madam");
        stringArrayList.add("civic");
        stringArrayList.add("openai");
        stringArrayList.add("hello");
        stringArrayList.add("radar");
        stringArrayList.add("world");
        stringArrayList.add("redivider");
        stringArrayList.add("engineering");
        stringArrayList.add("palindrome");
        stringArrayList.add("aa???bbaa");
        stringArrayList.add("bb2345aa");
        stringArrayList.add("Sit on a potato pan, Otis");
        stringArrayList.add("Go hang a salami, I'm a lasagna hog.");
        stringArrayList.add("radar");
        stringArrayList.add("hello");
        stringArrayList.add("level");
        stringArrayList.add("world");
        stringArrayList.add("madam");
        stringArrayList.add("openai");
        stringArrayList.add("deified");
        stringArrayList.add("programming");
        stringArrayList.add("civic");
        stringArrayList.add("arraylist");
        stringArrayList.add("stats");
        stringArrayList.add("algorithm");
        stringArrayList.add("noon");
        stringArrayList.add("computer");
        stringArrayList.add("racecar");
        stringArrayList.add("language");
        stringArrayList.add("level");
        stringArrayList.add("software");
        stringArrayList.add("redivider");
        stringArrayList.add("engineering");
        stringArrayList.add("palindrome");
        stringArrayList.add("repaper");
        stringArrayList.add("science");
        stringArrayList.add("step on no pets");
        stringArrayList.add("developer");
        stringArrayList.add("java");
        stringArrayList.add("rotor");
        stringArrayList.add("design");
        stringArrayList.add("kayak");
        stringArrayList.add("interface");
        stringArrayList.add("stats");
        stringArrayList.add("project");
        stringArrayList.add("deleveled");
        stringArrayList.add("computer");
        stringArrayList.add("level");
        stringArrayList.add("software");
        stringArrayList.add("racecar");
        stringArrayList.add("algorithm");
        stringArrayList.add("noon");
        stringArrayList.add("language");
        stringArrayList.add("madam");
        stringArrayList.add("civic");
        stringArrayList.add("openai");
        stringArrayList.add("hello");
        stringArrayList.add("radar");
        stringArrayList.add("world");
        stringArrayList.add("redivider");
        stringArrayList.add("engineering");
        stringArrayList.add("palindrome");
        stringArrayList.add("aa???bbaa");
        stringArrayList.add("bb2345aa");
        stringArrayList.add("Sit on a potato pan, Otis");
        stringArrayList.add("Go hang a salami, I'm a lasagna hog.");
        stringArrayList.add("radar");
        stringArrayList.add("hello");
        stringArrayList.add("level");
        stringArrayList.add("world");
        stringArrayList.add("madam");
        stringArrayList.add("openai");
        stringArrayList.add("deified");
        stringArrayList.add("programming");
        stringArrayList.add("civic");
        stringArrayList.add("arraylist");
        stringArrayList.add("stats");
        stringArrayList.add("algorithm");
        stringArrayList.add("noon");
        stringArrayList.add("computer");
        stringArrayList.add("racecar");
        stringArrayList.add("language");
        stringArrayList.add("level");
        stringArrayList.add("software");
        stringArrayList.add("redivider");
        stringArrayList.add("engineering");
        stringArrayList.add("palindrome");
        stringArrayList.add("repaper");
        stringArrayList.add("science");
        stringArrayList.add("step on no pets");
        stringArrayList.add("developer");
        stringArrayList.add("java");
        stringArrayList.add("rotor");
        stringArrayList.add("design");
        stringArrayList.add("kayak");
        stringArrayList.add("interface");
        stringArrayList.add("stats");
        stringArrayList.add("project");
        stringArrayList.add("deleveled");
        stringArrayList.add("computer");
        stringArrayList.add("level");
        stringArrayList.add("software");
        stringArrayList.add("racecar");
        stringArrayList.add("algorithm");
        stringArrayList.add("noon");
        stringArrayList.add("language");
        stringArrayList.add("madam");
        stringArrayList.add("civic");
        stringArrayList.add("openai");
        stringArrayList.add("hello");
        stringArrayList.add("radar");
        stringArrayList.add("world");
        stringArrayList.add("redivider");
        stringArrayList.add("engineering");
        stringArrayList.add("palindrome");
        stringArrayList.add("aa???bbaa");
        stringArrayList.add("bb2345aa");
        stringArrayList.add("Sit on a potato pan, Otis");
        stringArrayList.add("Go hang a salami, I'm a lasagna hog.");
        stringArrayList.add("radar");
        stringArrayList.add("hello");
        stringArrayList.add("level");
        stringArrayList.add("world");
        stringArrayList.add("madam");
        stringArrayList.add("openai");
        stringArrayList.add("deified");
        stringArrayList.add("programming");
        stringArrayList.add("civic");
        stringArrayList.add("arraylist");
        stringArrayList.add("stats");
        stringArrayList.add("algorithm");
        stringArrayList.add("noon");
        stringArrayList.add("computer");
        stringArrayList.add("racecar");
        stringArrayList.add("language");
        stringArrayList.add("level");
        stringArrayList.add("software");
        stringArrayList.add("redivider");
        stringArrayList.add("engineering");
        stringArrayList.add("palindrome");
        stringArrayList.add("repaper");
        stringArrayList.add("science");
        stringArrayList.add("step on no pets");
        stringArrayList.add("developer");
        stringArrayList.add("java");
        stringArrayList.add("rotor");
        stringArrayList.add("design");
        stringArrayList.add("kayak");
        stringArrayList.add("interface");
        stringArrayList.add("stats");
        stringArrayList.add("project");
        stringArrayList.add("deleveled");
        stringArrayList.add("computer");
        stringArrayList.add("level");
        stringArrayList.add("software");
        stringArrayList.add("racecar");
        stringArrayList.add("algorithm");
        stringArrayList.add("noon");
        stringArrayList.add("language");
        stringArrayList.add("madam");
        stringArrayList.add("civic");
        stringArrayList.add("openai");
        stringArrayList.add("hello");
        stringArrayList.add("radar");
        stringArrayList.add("world");
        stringArrayList.add("redivider");
        stringArrayList.add("engineering");
        stringArrayList.add("palindrome");
        return stringArrayList;
    }
}
