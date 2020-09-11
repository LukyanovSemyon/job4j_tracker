package ru.job4j.oop;

public class DummyDic {
    public static String engToRus(String eng){
        return eng;
    }
    public static void main(String[] args) {
        String word = engToRus("home");
        System.out.println("Неизвестное слово: " + word);
    }
}
