package session16_lambdas.live.lambda;

public class TruncateTextTest {

    public static void main(String[] args) {
        TruncateText truncateText = (input, maxLength) -> input.length() > maxLength ? input.substring(0, maxLength) : input;
        System.out.println(truncateText.truncate("hello", 500));
    }
}
