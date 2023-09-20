package session16.homework.challenge15;

import java.util.List;
import java.util.function.Predicate;

public interface ListFilter<T> {

    List<T> getFilteredList(List<T> inputList, Predicate<T> predicate);
}
