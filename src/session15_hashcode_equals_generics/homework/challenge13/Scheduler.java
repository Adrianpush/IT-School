package session15_hashcode_equals_generics.homework.challenge13;

import java.util.HashMap;

public class Scheduler {

    public static void main(String[] args) {
        HashMap<Day, String> scheduler = new HashMap<>();
        scheduler.put(Day.MONDAY, "Golf");
        scheduler.put(Day.TUESDAY, "Lord of the Rings Marathon");
    }


}
