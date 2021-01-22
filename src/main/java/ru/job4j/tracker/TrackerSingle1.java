package ru.job4j.tracker;

public enum TrackerSingle1 {
    INSTANCE;

    private final Store tracker = new SqlTracker();
    public Store getTracker() {
        return tracker;
    }
}
