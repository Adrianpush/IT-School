package session14_collections.homework.que;

import java.util.Comparator;

public class FrequencyComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair o1, Pair o2) {
        if (o1.getFrequency() > o2.getFrequency()) {
            return -1;
        } else if (o1.getFrequency() < o2.getFrequency()) {
            return 1;
        }
        return 0;
    }
}

