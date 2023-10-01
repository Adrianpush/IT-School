package session7_utilityclasses.homework.eventplanner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EventPlanner {

    public static void main(String[] args) {

        Event eventOne = new Event("Greeting", "Say hi",
                LocalDateTime.now().plusDays(3), LocalDateTime.now().plusDays(1));
        Event eventTwo = new Event("Smile", "Smile",
                LocalDateTime.now().plusDays(40), LocalDateTime.now().plusDays(3));
        eventTwo.setEventAsRecurring(20);
        Event eventThree = new Event("Cry", "Cry",
                LocalDateTime.now().plusDays(20), LocalDateTime.now().plusDays(2));
        Event eventFour = new Event("Invoke the wrath of Odin", "Sacrifice goat",
                LocalDateTime.now().plusDays(30), LocalDateTime.now().plusDays(10));
        Event eventFive = new Event("Time travel", "Ask Orwell",
                LocalDateTime.now().plusDays(20), LocalDateTime.now().plusDays(30));

        System.out.println("Time until eventFour is " + eventFour.timeUntilEvent());
        System.out.println("Time until reminder for eventFour is " + eventFour.timeUntilReminder());

        Scheduler scheduler = new Scheduler();
        scheduler.addEvent(eventOne);
        scheduler.addEvent(eventTwo);
        scheduler.addEvent(eventThree);
        scheduler.addEvent(eventFour);
        scheduler.addEvent(eventFive);

        System.out.println("Upcoming Events: " + scheduler.getUpcomingEvents(5));
        scheduler.removeEvent("Greeting");
        System.out.println("Upcoming Events after remove of event named Greeting: " + scheduler.getUpcomingEvents(5));
        System.out.println("Events on date: " + scheduler.getEventsOn(LocalDate.now().plusDays(20)));

        scheduler.addEvent(new Event("Wave", "Urgent",
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(1)));

        System.out.println("Pending reminders: " + scheduler.getPendingReminders());

        scheduler.removeEvent("Cry");
        System.out.println("Pending events after remove of event Cry: " + scheduler.getUpcomingEvents(567));

        Event eventSix = new Event("Past Event", "Time machine needed.",
                LocalDateTime.now().minusDays(4), LocalDateTime.now().minusDays(20));
        scheduler.addEvent(eventSix);
        System.out.println("Past events:"  + scheduler.getPastEvents(2));


    }
}
