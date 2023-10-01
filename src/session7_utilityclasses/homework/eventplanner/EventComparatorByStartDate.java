package session7_utilityclasses.homework.eventplanner;

import java.time.LocalDateTime;
import java.util.Comparator;

public class EventComparatorByStartDate implements Comparator<Event> {

    @Override
    public int compare(Event o1, Event o2) {
        LocalDateTime eventOneStartDate = o1.getEventStartDate();
        LocalDateTime eventTwoStartDate = o2.getEventStartDate();

        return eventOneStartDate.compareTo(eventTwoStartDate);
    }
}
