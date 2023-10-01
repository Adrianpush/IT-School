package session15_hashcode_equals_generics.live.enums;

public enum Day {

    MONDAY (true),
    TUESDAY (true),
    WEDNESDAY (true);

    private boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public boolean isWeekday() {
        return isWeekday;
    }
}
