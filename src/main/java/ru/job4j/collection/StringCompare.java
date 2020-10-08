package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        char[] leftCharArr = left.toCharArray();
        char[] rightCharArr = right.toCharArray();
        int length = Math.max(leftCharArr.length, rightCharArr.length);
        int[] leftIntArr = new int[length];
        for (int i = 0; i < leftCharArr.length; i++) {
            leftIntArr[i] = left.charAt(i);
        }
        int[] rightIntArr = new int[length];
        for (int i = 0; i < rightCharArr.length; i++) {
            rightIntArr[i] = right.charAt(i);
        }
            for (int i = 0; i < length; i++) {
                int rsl1 = Integer.compare(leftIntArr[i], rightIntArr[i]);
                if (rsl1 != 0) {
                    rsl = rsl1;
                    break;
                }
            }
        return rsl;
    }
}
