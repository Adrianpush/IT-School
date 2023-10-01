package session13_recap.livesession;

public class StringCompression {

    public static void main(String[] args) {
        String test = "abbbcccaaa";
        System.out.println(compressedString(test));
    }

    public static String compressedString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 1;
        for (int index = 0; index < input.length() - 1; index++) {
            char currentLetter = input.charAt(index);
            if (currentLetter != input.charAt(index + 1)){
                stringBuilder.append(currentLetter);
                stringBuilder.append(counter);
                counter = 0;
            }
            counter++;
        }
        stringBuilder.append(input.charAt(input.length()-1));
        stringBuilder.append(counter);
        return stringBuilder.toString();
    }
}
