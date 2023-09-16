package session15.live.enums;

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
