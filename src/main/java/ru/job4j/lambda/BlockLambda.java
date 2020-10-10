package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BlockLambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("bdf", "asdx", "cds"));
        System.out.println(list);
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return right.length() - left.length();
        };
        list.sort(cmpDescSize);
        System.out.println(list);
    }
}