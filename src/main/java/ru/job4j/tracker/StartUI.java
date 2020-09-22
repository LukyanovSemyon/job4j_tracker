package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    public static void createItem(Input input, Tracker tracker){
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    public static void showItems(Input input, Tracker tracker){
        System.out.println("=== Show all items ===");
        System.out.println(Arrays.toString(tracker.findAll()));
    }
    public static void replaceItem(Input input, Tracker tracker){
        System.out.println("=== Edit item ===");
        int id = input.askInt("Enter Id: ");
        String name = input.askStr("Enter item's name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)){
            System.out.println("Edit succeed");
        }else {
            System.out.println("Edit failed");
        }
    }
    public static void deleteItem(Input input, Tracker tracker){
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter Id: ");
        if (tracker.delete(id)){
            System.out.println("Delete succeed");
        }else {
            System.out.println("Delete failed");
        }
    }
    public static void findByIdItem(Input input, Tracker tracker){
        System.out.println("=== Find item by Id ===");
        int id = input.askInt("Enter Id: ");
        Item item  = tracker.findById(id);
        if (item == null){
            System.out.println("Item this id not found");
        }else {
            System.out.println(item);
        }
    }
    public static void findByNameItem(Input input, Tracker tracker){
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter item's name: ");
        Item[] item  = tracker.findByName(name);
        if (item.length > 0){
            System.out.println(Arrays.toString(item));
        }else {
            System.out.println("Items with this name not found");
        }
    }
    public void init(Input input, Tracker tracker){
        boolean run = true;
        while (run){
            this.showMenu();
            int select = input.askInt("Select:");
            if (select == 0){
                StartUI.createItem(input, tracker);
            }else if (select == 1){
                StartUI.showItems(input, tracker);
            }else if (select == 2){
                StartUI.replaceItem(input, tracker);
            }else if (select == 3){
                StartUI.deleteItem(input, tracker);
            }else if (select == 4){
                StartUI.findByIdItem(input, tracker);
            }else if (select == 5){
                StartUI.findByNameItem(input, tracker);
            }else if (select == 6) {
                run = false;
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu.\n0.Add newItem\n1.Show all items\n2.Edit item\n" +
                "3.Delete item\n4.Find item by Id\n5.Find items by name\n6.Exit Program");
    }
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input input = new ConsoleInput();
        new StartUI().init(input, tracker);
    }
}
