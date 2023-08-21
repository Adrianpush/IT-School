package session7.homework.eventplanner;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {

    private String eventName;
    private String eventDescription;
    private LocalDateTime eventStartDate;
    private LocalDateTime remindOnDate;
    private boolean isRecurring;
    private Duration frequencyInDays;

    public Event(String eventName, String eventDescription, LocalDateTime eventStartDate, LocalDateTime remindOnDate) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventStartDate = eventStartDate;
        this.remindOnDate = remindOnDate;
        if (!isReminderValid()) {
            setReminderTo24HoursBeforeEvent();
        }
        this.isRecurring = false;
        this.frequencyInDays = Duration.ofDays(0);
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(LocalDateTime eventStartDate) {
        this.eventStartDate = eventStartDate;
        if (!isReminderValid()) {
            setReminderTo24HoursBeforeEvent();
        }
    }

    public LocalDateTime getRemindOnDate() {
        return remindOnDate;
    }

    public void setRemindOnDate(LocalDateTime remindOnDate) {
        if (isReminderValid()) {
            this.remindOnDate = remindOnDate;
        } else {
            setReminderTo24HoursBeforeEvent();
        }
    }

    public void setEventAsRecurring(long days){
        setRecurring(true);
        setFrequencyInDays(Duration.ofDays(days));
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public void setRecurring(boolean recurring) {
        isRecurring = recurring;
    }

    public Duration getFrequencyInDays() {
        return frequencyInDays;
    }

    public void setFrequencyInDays(Duration frequencyInDays) {
        this.frequencyInDays = frequencyInDays;
    }

    public String timeUntilEvent() {
        Duration timeUntilEvent = Duration.between(LocalDateTime.now(), eventStartDate);
        return timeUntilEvent.toDaysPart() + " days, " +
                timeUntilEvent.toHoursPart() + " hours, " +
                timeUntilEvent.toMinutesPart() + " minutes " +
                timeUntilEvent.toSecondsPart() + " seconds.";
    }

    public String timeUntilReminder() {
        Duration timeUntilEventReminder = Duration.between(LocalDateTime.now(), remindOnDate);
        return timeUntilEventReminder.toDaysPart() + " days, " +
                timeUntilEventReminder.toHoursPart() + " hours, " +
                timeUntilEventReminder.toMinutesPart() + " minutes " +
                timeUntilEventReminder.toSecondsPart() + " seconds.";
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventStartDate=" + eventStartDate +
                ", remindOnDate=" + remindOnDate +
                '}';
    }

    private boolean isReminderValid() {
        boolean isValid = this.remindOnDate.isBefore(this.eventStartDate);
        if (!isValid) {
            System.out.println("Reminder invalid.");
        }
        return isValid;
    }

    private void setReminderTo24HoursBeforeEvent() {
        this.remindOnDate = this.eventStartDate.minusDays(1);
        System.out.println("Reminder defaulted to 24 hours before event.");
    }
}
