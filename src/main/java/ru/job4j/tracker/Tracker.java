package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(){
        Item [] namesWithoutNull = new Item[items.length];
        int sizeA = 0;
        for (int index = 0; index < items.length; index++){
            if (items[index] != null){
                namesWithoutNull[sizeA] = items[index];
                sizeA++;
            }
        }
        return Arrays.copyOf(namesWithoutNull, sizeA);
    }

    public Item[] findByName(String key){
        Item[] names = new Item[size];
        int sizeN = 0;
        for (int index = 0; index < size; index++){
            Item item = this.items[index];
            if(item.getName().equals(key)){
                names[sizeN] = item;
                sizeN++;
            }
        }
        return Arrays.copyOf(names, sizeN);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
