package session7.homework.eventplanner;

import java.time.LocalDateTime;
import java.util.Comparator;

public class EventComparatorByReminderDate implements Comparator<Event> {

    @Override
    public int compare(Event o1, Event o2) {
        LocalDateTime eventOneReminderDate = o1.getRemindOnDate();
        LocalDateTime eventTwoReminderDate = o2.getRemindOnDate();
        return eventOneReminderDate.compareTo(eventTwoReminderDate);
    }
}
