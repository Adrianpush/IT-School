package session15_hashcode_equals_generics.live.enums;

public class EnumsPractice {

    public static void main(String[] args) {
        printEnumValues();
    }

    private static void printEnumValues() {
        for (Day day : Day.values()) {
            System.out.println(day + " " + day.isWeekday());
        }
    }

    private static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("Start of the week");
            case TUESDAY -> System.out.println("Second");
            case WEDNESDAY -> System.out.println("Frogs");
            default -> System.out.println("Invalid");
        }
    }
}
