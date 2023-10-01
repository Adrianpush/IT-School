package session16_lambdas.homework.challenge7;

public class StringTrimmerTest {

    public static void main(String[] args) {
        StringTrimmer stringTrimmer = (String a, int b) -> a.substring(0, Math.min(a.length(),b));
        System.out.println(stringTrimmer.trimString("Hello, world!", 1));
    }
}
