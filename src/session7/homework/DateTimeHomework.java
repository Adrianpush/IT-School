package session7.homework;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.zone.ZoneRulesException;
import java.util.Scanner;

public class DateTimeHomework {

    public static void main(String[] args) {
        displayTodaysDate();

        displayDateComponents(LocalDate.now());

        System.out.println(createSpecificDate());

        System.out.println(areDatesEqual());

        System.out.println(isTodaySpecificDate(LocalDate.of(2019, 12, 10)));

        displayCurrentTime();

        System.out.println(addWeeksToToday(5));

        System.out.println(findDayOfWeek(LocalDate.now().plusDays(356)));

        System.out.println(daysBetween());

        System.out.println(isValidDate());

        System.out.println(elapsedTimeSince("08:22:00"));

        convertToTimeZone();
    }

    /**
     * Displaying Today's Date
     * Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
     * Expected Output: Today's date in the format YYYY-MM-DD.
     */
    public static void displayTodaysDate() {
        System.out.println(LocalDate.now());
    }

    /**
     * Date Decomposition
     * Description: Write a method named displayDateComponents
     * that accepts a date as an argument and prints its year, month, and day components separately.
     */
    public static void displayDateComponents(LocalDate localDate) {
        String stringBuilder = "Year: " + localDate.getYear() + "\n" + "Month: " + localDate.getMonth() +
                "\n" + "Day: " + localDate.getDayOfMonth() + "\n";
        System.out.println(stringBuilder);
    }

    /**
     * Create a Specific Date
     * Description: Write a method named createSpecificDate
     * that returns a date object representing 19th August 2025.
     * Expected Output: A date object for 2025-8-19.
     */
    public static LocalDate createSpecificDate() {
        return LocalDate.of(2025, 8, 19);
    }

    /**
     * Comparing User-Entered Dates
     * Description: Write a method named areDatesEqual
     * that reads two dates from the console and returns true if they are equal, and false otherwise.
     * Input: Two dates entered by the user in the format YYYY-MM-DD.
     * Expected Output:
     * true if both dates are equal.
     * false if they are different.
     */
    public static boolean areDatesEqual() {
        String message = "Please enter the first date in the format YYYY-MM-DD";
        LocalDate firstDate = getValidDateFromUser(message);
        message = "Please enter the second date in the format YYYY-MM-DD";
        LocalDate secondDate = getValidDateFromUser(message);
        return firstDate.isEqual(secondDate);
    }

    /**
     * Is Today a Specific Date?
     * Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
     * Expected Output:
     * true if today's date is 2019-12-10.
     * false otherwise.
     */
    public static boolean isTodaySpecificDate(LocalDate dateToCheck) {
        LocalDate specificDate = LocalDate.of(2019, 12, 10);
        return specificDate.equals(dateToCheck);
    }

    /**
     * Getting Current Time
     * Description: Write a method named displayCurrentTime that prints the current time to the console.
     * Expected Output: The current time in the format HH:MM:SS.
     */
    public static void displayCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(LocalTime.now().format(formatter));
    }

    /**
     * Date Arithmetic
     * Description: Write a method named addWeeksToToday that accepts an integer as its argument.
     * This integer denotes the number of weeks.
     * The method should add this number of weeks to today's date and return the resultant date.
     * Input: An integer n (e.g., 4).
     * Expected Output: A date object that is n weeks from today.
     */
    public static LocalDate addWeeksToToday(int numWeeks) {
        return LocalDate.now().plusWeeks(numWeeks);
    }

    /**
     * Weekday Identifier
     * Description: Construct a method named findDayOfWeek
     * that takes in a date and returns the specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
     * Input: A date in the format YYYY-MM-DD.
     * Expected Output: The day of the week in string format (e.g., "Wednesday").
     */
    public static String findDayOfWeek(LocalDate date) {
        StringBuilder stringBuilder = new StringBuilder(date.getDayOfWeek().name().toLowerCase());
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    /**
     * Interval Between Dates
     * Description: Design a method titled daysBetween
     * that reads two dates from the console and computes the total number of days between them.
     * Input: Two dates given by the user in the format YYYY-MM-DD.
     * Expected Output: An integer showcasing the difference in days between the two dates.
     */
    public static int daysBetween() {
        LocalDate firstDate = getValidDateFromUser("Please enter the first date in the format YYYY-MM-DD");
        LocalDate secondDate = getValidDateFromUser("Please enter the second date in the format YYYY-MM-DD");
        Duration differenceInDays = Duration.between(firstDate.atStartOfDay(), secondDate.atStartOfDay());
        return (int) differenceInDays.toDays();
    }

    /**
     * Date Authenticator
     * Description: Engineer a method named isValidDate
     * that captures a date string from the console and assesses if it conforms to a valid date format (YYYY-MM-DD).
     * The method should also consider leap years when validating February dates.
     * Input: A string of a date from the console.
     * Expected Output:
     * true if the input adheres to the date format and denotes a genuine date.
     * false if otherwise.
     */
    public static boolean isValidDate() {
        return getValidDateFromUser("Please enter a date in the format YYYY-MM-DD") != null;
    }

    /**
     * Duration Since
     * Description: Construct a method dubbed elapsedTimeSince
     * that ingests a prior time (in the HH:MM:SS format) as its input
     * and displays the time duration from that moment to the present.
     * Input: A time given in the format HH:MM:SS.
     * Expected Output: The time span given as X hours, Y minutes, Z seconds.
     */
    public static String elapsedTimeSince(String previousTimeString) {
        String durationString;
        try {
            LocalTime previousTime = LocalTime.parse(previousTimeString);
            Duration duration = Duration.between(previousTime, LocalTime.now());
            long hours = duration.toHours();
            long minutes = duration.toMinutes();
            long seconds = duration.toSeconds();
            durationString = hours + " hours, " +
                    (minutes - hours * 60) + " minutes, " +
                    (seconds - minutes * 60) + " seconds.";
        } catch (DateTimeParseException exception) {
            durationString = exception.getMessage();
        }
        return durationString;
    }

    /**
     * Time Conversion Across Zones
     * Description: Develop a method named convertToTimeZone
     * that collects a date and time from the console
     * in the pattern YYYY-MM-DD HH:MM:SS and a timezone (like "EST", "PST").
     * The objective is to transmute the specified date and time to align with the provided timezone
     * and then showcase the result.
     * Input:
     * Date and time structured as YYYY-MM-DD HH:MM:SS.
     * A string indicating the timezone (e.g., "EST").
     * Expected Output: The recalibrated date and time synchronized with the inputted timezone.
     */
    public static void convertToTimeZone() {
        LocalDate userDate = getValidDateFromUser("Please enter the date in the format YYYY-MM-DD");
        LocalTime userTime = getValidTimeFromUser("Please enter the time in the format HH:MM:SS");
        ZoneId timeZone = getValidZoneIdFromUser();

        ZonedDateTime userDateTime = LocalDateTime.of(userDate, userTime).atZone(ZoneId.systemDefault());
        String dateTimeAtRequestedZone = userDateTime.withZoneSameInstant(timeZone).toString().substring(0, 19);
        StringBuilder stringBuilder = new StringBuilder(dateTimeAtRequestedZone);
        stringBuilder.replace(10, 11, " ");
        System.out.println(stringBuilder);
    }

    private static LocalDate getValidDateFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidDate = false;
        LocalDate localDate = null;

        while (!isValidDate) {
            System.out.println(prompt);
            String dateString = scanner.next();
            try {
                localDate = LocalDate.parse(dateString);
                isValidDate = true;
            } catch (DateTimeParseException exception) {
                System.out.println("Invalid date.\n" + exception.getMessage());
            }
        }
        return localDate;
    }

    private static LocalTime getValidTimeFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidTime = false;
        LocalTime localTime = null;

        while (!isValidTime) {
            System.out.println(prompt);
            String localTimeString = scanner.next();
            try {
                localTime = LocalTime.parse(localTimeString);
                isValidTime = true;
            } catch (DateTimeParseException exception) {
                System.out.println("Invalid time.\n" + exception.getMessage());
            }
        }
        return localTime;
    }

    private static ZoneId getValidZoneIdFromUser() {
        Scanner scanner = new Scanner(System.in);
        boolean isIdValid = false;
        ZoneId userZoneId = null;
        while (!isIdValid) {
            System.out.println("Please enter zone ID");
            String userZoneIdString = scanner.next().toUpperCase();
            try {
                userZoneId = ZoneId.of(userZoneIdString, ZoneId.SHORT_IDS);
                isIdValid = true;
            } catch (ZoneRulesException exception) {
                System.out.println(exception.getMessage());
            }
        }
        return userZoneId;
    }
}