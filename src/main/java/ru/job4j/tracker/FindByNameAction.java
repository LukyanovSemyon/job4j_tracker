package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter item's name: ");
        List<Item> item  = tracker.findByName(name);
        if (item.size() > 0) {
            for (int i = 0; i < item.size(); i++) {
                out.println(item);
            }
        } else {
            out.println("Items with this name not found");
        }
        return true;
    }
}
