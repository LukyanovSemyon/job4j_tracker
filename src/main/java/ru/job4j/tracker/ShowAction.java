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
        Item[] item  = tracker.findAll();
        for (int i = 0; i < item.length; i++)
            out.println(item[i]);
        return true;
    }
}
