package ru.job4j.tracker;

import java.util.Arrays;

public class FindByNameAction implements UserAction{
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter item's name: ");
        Item[] item  = tracker.findByName(name);
        if (item.length > 0){
            System.out.println(Arrays.toString(item));
        }else {
            System.out.println("Items with this name not found");
        }
        return true;
    }
}
