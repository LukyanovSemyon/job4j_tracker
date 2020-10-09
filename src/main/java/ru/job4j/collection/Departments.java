package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                } else {
                    start = start + "/" + el;
                }
                tmp.add(start);
            }
        }
        return sortAsc(new ArrayList<>(tmp));
    }

    public static List<String> sortAsc(List<String> orgs) {
        Collections.sort(orgs);
        return orgs;
    }

    public static void sortDesc(List<String> orgs) {
    }
}
