package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> nameCheck = (Person per) -> per.getName().contains(key);
        Predicate<Person> surnameCheck = (Person per) -> per.getSurname().contains(key);
        Predicate<Person> phoneCheck = (Person per) -> per.getPhone().contains(key);
        Predicate<Person> addressCheck = (Person per) -> per.getAddress().contains(key);
        Predicate<Person> combine =  nameCheck.or(surnameCheck).or(phoneCheck).or(addressCheck);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
