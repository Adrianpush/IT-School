package session16.live.lambda;

@FunctionalInterface
public interface TruncateText {

    String truncate(String input, int maxLength);
}
