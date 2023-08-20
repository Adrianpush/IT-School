package session7.homework.eventplanner;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Scheduler {

    PriorityQueue<Event> scheduleByStartDate;
    PriorityQueue<Event> scheduleByReminders;
    PriorityQueue<Event> pastEvents;

    public Scheduler() {
        this.scheduleByStartDate = new PriorityQueue<>(new EventComparatorByStartDate());
        this.scheduleByReminders = new PriorityQueue<>(new EventComparatorByReminderDate());
        this.pastEvents = new PriorityQueue<>(new EventComparatorByStartDate().reversed());
    }

    public void addEvent(Event event) {
        if (event.getEventStartDate().isBefore(LocalDateTime.now())) {
            pastEvents.add(event);
        } else {
            scheduleByStartDate.add(event);
            scheduleByReminders.add(event);
        }
    }

    public void removeEvent(String eventName) {

        for (Event event : scheduleByStartDate) {
            if (event.getEventName().equals(eventName)) {
                scheduleByStartDate.remove(event);
                scheduleByReminders.remove(event);
                break;
            }
        }
    }

    public List<Event> getUpcomingEvents(int numberOfEvents) {
        removePastEvents();
        List<Event> events = new ArrayList<>();
        for (int index = 0; index < numberOfEvents; index++) {
            if (scheduleByStartDate.peek() == null) {
                break;
            } else {
                events.add(scheduleByStartDate.poll());
            }
        }
        scheduleByStartDate.addAll(events);
        return events;
    }

    public List<Event> getEventsOn(LocalDate date) {
        List<Event> events = new ArrayList<>();
        for (Event event : scheduleByStartDate) {
            if (event.getEventStartDate().toLocalDate().equals(date)) {
                events.add(event);
            }
        }
        return events;
    }

    public List<Event> getPendingReminders() {
        removePastEvents();
        List<Event> eventsWithPendingReminders = new ArrayList<>();
        boolean listCompleted = false;
        while (!listCompleted) {
            Event event = scheduleByReminders.poll();
            if (event == null) {
                break;
            }
            Duration duration = Duration.between(LocalDateTime.now(), event.getRemindOnDate());
            if (duration.toHours() < 24) {
                eventsWithPendingReminders.add(event);
            } else {
                scheduleByReminders.add(event);
                listCompleted = true;
            }
        }
        scheduleByReminders.addAll(eventsWithPendingReminders);
        return eventsWithPendingReminders;
    }

    public List<Event> getPastEvents(int numberOfEvents) {
        List<Event> pastEventsList = new ArrayList<>();
        for (int iteration = 0; iteration < numberOfEvents; iteration++) {
            if (pastEvents.peek() == null) {
                break;
            } else {
                pastEventsList.add(pastEvents.poll());
            }
        }
        pastEvents.addAll(pastEventsList);
        return pastEventsList;
    }

    private void removePastEvents() {
        boolean removedAllPastEvents = false;
        while (!removedAllPastEvents) {
            Event closestEvent = scheduleByStartDate.peek();
            if (closestEvent == null || closestEvent.getEventStartDate().isAfter(LocalDateTime.now())) {
                removedAllPastEvents = true;
            } else if (closestEvent.getEventStartDate().isBefore(LocalDateTime.now())) {
                closestEvent = scheduleByStartDate.poll();
                pastEvents.add(closestEvent);
                scheduleByReminders.remove(closestEvent);
                if (closestEvent.isRecurring()) {
                    closestEvent.setEventStartDate(closestEvent.
                            getEventStartDate().
                            plus(closestEvent.
                                    getFrequencyInDays()));
                    closestEvent.setRemindOnDate(closestEvent.
                            getRemindOnDate().
                            plus(closestEvent.
                                    getFrequencyInDays()));
                    scheduleByStartDate.add(closestEvent);
                    scheduleByReminders.add(closestEvent);
                }
            }
        }
    }

}
