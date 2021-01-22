package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Edit item ===");
        int id = input.askInt("Enter Id: ");
        String name = input.askStr("Enter item's name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Edit succeed");
        } else {
            out.println("Edit failed");
        }
        return true;
    }
}
