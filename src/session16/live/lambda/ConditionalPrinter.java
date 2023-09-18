package session16.live.lambda;

@FunctionalInterface
public interface ConditionalPrinter {

    void print(String input, boolean condition);
}
