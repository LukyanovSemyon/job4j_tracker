package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public enum TrackerSingle1 {
    INSTANCE;

    private final Tracker tracker = new Tracker();
    public Tracker getTracker() {
        return tracker;
    }

    public Item add(Item model) {
        return model;
    }
}
