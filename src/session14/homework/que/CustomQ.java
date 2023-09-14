package session14.homework.que;

import java.util.PriorityQueue;

public class CustomQ {

    PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(new FrequencyComparator());

    public PriorityQueue<Pair> getPriorityQueue() {
        return priorityQueue;
    }
}
