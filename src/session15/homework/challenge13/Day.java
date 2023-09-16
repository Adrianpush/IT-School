package session15.homework.challenge13;

public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WENSDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int dayNum;

    Day(int dayNum) {
        this.dayNum = dayNum;
    }

    public int getDayNum() {
        return dayNum;
    }
}


