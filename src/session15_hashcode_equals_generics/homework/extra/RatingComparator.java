package session15_hashcode_equals_generics.homework.extra;

import java.util.Comparator;

public class RatingComparator<T extends Rating> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int o1Rating = o1 == null ? 0 : o1.getRating();
        int o2Rating = o2 == null ? 0 : o2.getRating();

        return o1Rating - o2Rating;
    }
}
