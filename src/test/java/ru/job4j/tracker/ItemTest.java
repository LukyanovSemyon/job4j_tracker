package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void compareTo() {
        List<Item> items = Arrays.asList(
            new Item("third"),
            new Item("first"),
            new Item("second")
        );
        Collections.sort(items, new SortByNameItem());
        List<Item> items2 = Arrays.asList(
                new Item("first"),
                new Item("second"),
                new Item("third")
        );
        assertThat(items, is(items2));
    }

    @Test
    public void compareToRev() {
        List<Item> items = Arrays.asList(
                new Item("third"),
                new Item("first"),
                new Item("second")
        );
        Collections.sort(items, new SortByNameItemRev());
        List<Item> items2 = Arrays.asList(
                new Item("third"),
                new Item("second"),
                new Item("first")
        );
        assertThat(items, is(items2));
    }
}