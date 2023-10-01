package session16_lambdas.live.lambda;

@FunctionalInterface
public interface TruncateText {

    String truncate(String input, int maxLength);
}
