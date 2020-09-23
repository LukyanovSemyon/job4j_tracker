package ru.job4j.tracker;

import java.util.Arrays;

public class ShowAction implements UserAction{
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ===");
        out.println(Arrays.toString(tracker.findAll()));
        return true;
    }
}
