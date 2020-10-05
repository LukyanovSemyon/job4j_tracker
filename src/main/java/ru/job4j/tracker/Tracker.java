package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private List<Item> items = new ArrayList<Item>();
    private int ids = 1;

    public List<Item> add(Item item) {
        item.setId(ids++);
        items.add(item);
        return items;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        ArrayList<Item> names = new ArrayList<Item>();
        for (Item value : items) {
            if (value.getName().equals(key)) {
                names.add(value);
            }
        }
        return names;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            Item value = items.get(index);
            if (value.getId() == id) {
                rsl = index;
                break;
            }
        }
        return  rsl;
    }

    private int indexOfName(String key) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            Item value = items.get(index);
            if (value.getName().equals(key)) {
                rsl = index;
                break;
            }
        }
        return  rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        Item value = null;
        if (index != -1) {
            value = items.get(index);
        }
        return value;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            items.set(id, item);
        }
        return index != -1;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            items.remove(id);
        }
        return index != -1;
    }
}
