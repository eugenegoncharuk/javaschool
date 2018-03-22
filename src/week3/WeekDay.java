package week3;

public enum WeekDay {

    MONDAY(1, false),
    SUNDAY(7, true);

    private int seq;
    private boolean isWeekend;

    WeekDay(int seq, boolean isWeekend) {
        this.seq = seq;
        this.isWeekend = isWeekend;
    }

    public String toString() {
        return "seq=" + seq + " isWeekend=" + isWeekend;
    }

}
