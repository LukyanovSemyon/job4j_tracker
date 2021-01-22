package ru.job4j.tracker;

public class TrackerSingle2 {
    private static Store instance;

    private TrackerSingle2() {
    }

    public static Store getInstance() {
        if (instance == null) {
            instance = new SqlTracker();
        }
        return instance;
    }
}

