package session6_coreapi.livesession;

public class EqualsStringExamples {

    public static void main(String[] args) {
        String colour1 = "Blue";
        String colour2 = "blue";

        System.out.println(colour1.equals(colour2));
        System.out.println(colour1.equalsIgnoreCase(colour2));

        System.out.println(getStringStartsWith(colour1, "Adi"));
        System.out.println(getStringEndsWith(colour1, "Adi"));

        String sentence = "        I like to eat apple pie.     ";
        System.out.println(sentence.contains("pie"));

        System.out.println(sentence.replace('a', 'b'));
        System.out.println(sentence.trim());
    }

    public static boolean getStringStartsWith(String input, String startsWith){
        return input.startsWith(startsWith);
    }

    public static boolean getStringEndsWith(String input, String startsWith){
        return input.endsWith(startsWith);
    }
}
