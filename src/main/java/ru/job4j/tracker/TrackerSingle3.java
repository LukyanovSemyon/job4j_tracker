package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public class TrackerSingle3 {
    private static final Tracker INSTANCE = new Tracker();

    private TrackerSingle3() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }
}

