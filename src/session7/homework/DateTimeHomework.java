package session7.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateTimeHomework {

    public static void main(String[] args) {
        displayTodaysDate();

        displayDateComponents(LocalDate.now());

        System.out.println(createSpecificDate());

//        System.out.println(areDatesEqual());

        System.out.println(isTodaySpecificDate(LocalDate.of(2019,12,10)));

        displayCurrentTime();

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
        String stringBuilder = "Year: " + localDate.getYear() + "\n" +
                "Month: " + localDate.getMonth() + "\n" +
                "Day: " + localDate.getDayOfMonth() + "\n";
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

    private static LocalDate getValidDateFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidDate = false;
        LocalDate localDate = null;

        while (!isValidDate) {
            System.out.println(message);
            String firstDateString = scanner.next();
            try {
                localDate = LocalDate.parse(firstDateString);
                isValidDate = true;
            } catch (DateTimeParseException exception) {
                System.out.println("Invalid date.\n" + exception.getMessage());
            }
        }
        return localDate;
    }

    /**
     * Is Today a Specific Date?
     * Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
     * Expected Output:
     * true if today's date is 2019-12-10.
     * false otherwise.
     */
    public static boolean isTodaySpecificDate(LocalDate dateToCheck){
        LocalDate specificDate = LocalDate.of(2019,12,10);
        return specificDate.equals(dateToCheck);
    }

    /**
     * Getting Current Time
     * Description: Write a method named displayCurrentTime that prints the current time to the console.
     * Expected Output: The current time in the format HH:MM:SS.
     */
    public static void displayCurrentTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(LocalTime.now().format(formatter));
    }
}