package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        char[] leftCharArr = left.toCharArray();
        char[] rightCharArr = right.toCharArray();
        int length = Math.min(leftCharArr.length, rightCharArr.length);
            for (int i = 0; i < length; i++) {
                int rsl1 = Integer.compare(leftCharArr[i], rightCharArr[i]);
                if (rsl1 != 0) {
                    rsl = rsl1;
                    break;
                }
            }
            if (rsl == 0) {
                rsl = Integer.compare(leftCharArr.length, right.toCharArray().length);
            }
        return rsl;
    }
}
