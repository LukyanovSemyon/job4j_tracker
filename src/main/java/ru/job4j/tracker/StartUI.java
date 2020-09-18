package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item first = new Item(2,"first");
        Item second = new Item(4,"second");
        Item third = new Item(6,"third");
        Item forth = new Item(7,"forth");
        Item fifth = new Item("fifth");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        tracker.add(forth);
        tracker.add(fifth);
        tracker.findById(3);
        System.out.println(tracker.findById(3).getName());
        tracker.findAll();
        System.out.println(Arrays.toString(tracker.findAll()));
        System.out.println(Arrays.toString(tracker.findByName("forth")));
    }
}
