package session5.homework;

public class StringReverser {

    public static void main(String[] args) {
        System.out.println(getReversedString(UserInput.getStringInput("Enter string to be reversed.")));
    }

    public static String getReversedString(String input) {
        char[] reversedStringCharArray = new char[input.length()];
        int charArrayIndex = 0;
        for (int index = input.length() - 1; index >= 0; index--) {
            reversedStringCharArray[charArrayIndex] = input.charAt(index);
            charArrayIndex++;
        }
        return new String(reversedStringCharArray);
    }
}