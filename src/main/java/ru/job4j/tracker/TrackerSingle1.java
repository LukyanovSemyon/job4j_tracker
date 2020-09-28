package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public enum TrackerSingle1 {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }
}
