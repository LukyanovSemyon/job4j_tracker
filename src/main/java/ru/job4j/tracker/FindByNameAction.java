package ru.job4j.tracker;

import java.util.Arrays;

public class FindByNameAction implements UserAction{
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter item's name: ");
        Item[] item  = tracker.findByName(name);
        if (item.length > 0){
            out.println(Arrays.toString(item));
        }else {
            out.println("Items with this name not found");
        }
        return true;
    }
}
