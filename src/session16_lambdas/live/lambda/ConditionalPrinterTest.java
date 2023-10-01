package session16_lambdas.live.lambda;

public class ConditionalPrinterTest {

    public static void main(String[] args) {
        ConditionalPrinter conditionalPrinter = (input, condition) -> {
            if (condition) System.out.println(input);
        };

        conditionalPrinter.print("Hello John", true);
        conditionalPrinter.print("Hello Bob", false);
    }
}
