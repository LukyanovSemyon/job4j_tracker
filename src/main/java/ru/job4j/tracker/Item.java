package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {

    LocalDateTime created = LocalDateTime.now();
    public LocalDateTime getCreated() {
        return created;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}