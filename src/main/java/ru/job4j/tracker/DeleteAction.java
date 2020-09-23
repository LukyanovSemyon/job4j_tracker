package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter Id: ");
        if (tracker.delete(id)){
            System.out.println("Delete succeed");
        }else {
            System.out.println("Delete failed");
        }
        return true;
    }
}
