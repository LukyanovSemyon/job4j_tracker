package ru.job4j.tracker;

public class TrackerSingle4 {
    private TrackerSingle4() {
    }

    public static Store getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final Store INSTANCE = new SqlTracker();
    }
}
