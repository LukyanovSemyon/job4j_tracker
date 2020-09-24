package ru.job4j.oop;

public class DummyDic {
    public static String engToRus(String eng) {
        return "Неизвестное слово: " + eng;
    }

    public static void main(String[] args) {
        String check1 = engToRus("home");
        String check2 = engToRus("house");
        System.out.println(check1);
        System.out.println(check2);
    }
}
