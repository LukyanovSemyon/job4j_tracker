package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public class TrackerSingle4 {
    private TrackerSingle4() {
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingle4.getInstance();
    }
}
