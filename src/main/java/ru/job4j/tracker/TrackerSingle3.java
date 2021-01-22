package ru.job4j.tracker;

public class TrackerSingle3 {
    private static final Store INSTANCE = new SqlTracker();

    private TrackerSingle3() {
    }

    public static Store getInstance() {
        return INSTANCE;
    }
}

