package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(-1);
        list.add(4);
        list.add(-3);
        List<Integer> positive = list.stream().filter(
                integer -> integer > 0
                ).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
