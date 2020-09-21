package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker){
        boolean run = true;
        while (run){
            this.showMenu();
            System.out.println("Select:");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0){
                System.out.println("=== Create a new Item ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            }else if (select == 1){
                System.out.println("=== Show all items ===");
                System.out.println(Arrays.toString(tracker.findAll()));
            }else if (select == 2){
                System.out.println("=== Edit item ===");
                System.out.println("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter item's name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)){
                    System.out.println("Edit succeed");
                }else {
                    System.out.println("Edit failed");
                }
            }else if (select == 3){
                System.out.println("=== Delete item ===");
                System.out.println("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)){
                    System.out.println("Delete succeed");
                }else {
                    System.out.println("Delete failed");
                }
            }else if (select == 4){
                System.out.println("=== Find item by Id ===");
                System.out.println("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item item  = tracker.findById(id);
                if (item == null){
                    System.out.println("Item this id not found");
                }else {
                    System.out.println(item);
                }
            }else if (select == 5){
                System.out.println("=== Find items by name ===");
                System.out.println("Enter item's name: ");
                String name = scanner.nextLine();
                Item[] item  = tracker.findByName(name);
                if (item.length > 0){
                    System.out.println(Arrays.toString(item));
                }else {
                    System.out.println("Items with this name not found");
                }
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
        Scanner scanner = new Scanner(System.in);
        new StartUI().init(scanner, tracker);
    }
}
