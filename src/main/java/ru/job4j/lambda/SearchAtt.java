package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list, int num) {
        Predicate<Attachment> predicate = (Attachment o) -> o.getSize() > num;
        return filter(list, predicate);
    }

    public static List<Attachment> filterName(List<Attachment> list, String s) {
        Predicate<Attachment> predicate = (Attachment o) -> o.getName().contains(s);
        return filter(list, predicate);
    }

    private static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (predicate.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> rsl = List.of(
                new Attachment("fsdf", 150),
                new Attachment("bug", 50),
                new Attachment("bug", 99),
                new Attachment("djd", 101)
        );
        System.out.println(rsl);
        System.out.println(filterName(rsl, "bug"));
        System.out.println(filterSize(rsl, 100));
    }
}
