package session16_lambdas.homework.challenge11;

import java.util.List;

@FunctionalInterface
public interface FindInList<T> {
    boolean findInList(List<T> input, T item);
}
