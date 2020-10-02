package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person value : persons) {
            if (value.getName().contains(key)) {
                result.add(value);
            } else if (value.getSurname().contains(key)) {
                result.add(value);
            } else if (value.getPhone().contains(key)) {
                result.add(value);
            } else if (value.getAddress().contains(key)) {
                result.add(value);
            }
        }
        return result;
    }
}

