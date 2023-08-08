package session4.homework;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("aa???bbaa"));
        System.out.println(isPalindrome("bb2345aa"));
        System.out.println(isPalindrome("Sit on a potato pan, Otis"));
        System.out.println(isPalindrome("Go hang a salami, I'm a lasagna hog."));
        System.out.println(isPalindrome("Notmykindaoffirecracker."));
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
}
