package ru.job4j.calculator;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;
    }
    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }
    public static int max(int first, int second, int third, int forth) {
        return max(first, max(second, third, forth));
    }
    public static void main(String[] args) {
        int num = Max.max(33, 40,55);
        System.out.println(num);
        int num2 = Max.max(33, 40,55, 87);
        System.out.println(num2);
    }
}
