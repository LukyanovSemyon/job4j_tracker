package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] ooo1 = o1.split("/");
        String[] ooo2 = o2.split("/");
        int rsl = ooo2[0].compareTo(ooo1[0]);
        if (rsl == 0) {
            rsl = o1.compareTo(o2);
        }
        return rsl;
    }
}
