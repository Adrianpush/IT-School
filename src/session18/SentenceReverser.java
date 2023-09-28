package session18;

public class SentenceReverser {

    public static void main(String[] args) {
        String sentence = "Around the world, around the world";
        System.out.println(reverseSentence(sentence));
    }

    private static String reverseSentence(String input) {
        String[] words = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = words.length - 1; index > 0; index--) {
            stringBuilder.append(words[index]);
            stringBuilder.append(" ");
        }
        stringBuilder.append(words[0]);
        return stringBuilder.toString();
    }
}
