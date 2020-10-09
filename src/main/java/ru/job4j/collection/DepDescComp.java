package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] ooo1 = o1.split("/");
        String[] ooo2 = o2.split("/");
        int length = Math.min(ooo1.length, ooo2.length);
        int rsl = ooo2[0].compareTo(ooo1[0]);
        if (rsl == 0) {
            for (int i = 1; i < length; i++) {
                rsl = ooo1[i].compareTo(ooo2[i]);
            }
            if (rsl == 0) {
                rsl = Integer.compare(ooo1.length, ooo2.length);
            }
        }
        return rsl;
    }
}
