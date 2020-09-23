package ru.job4j.tracker;

public class EditAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter Id: ");
        String name = input.askStr("Enter item's name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)){
            System.out.println("Edit succeed");
        }else {
            System.out.println("Edit failed");
        }
        return true;
    }
}
