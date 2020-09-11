package ru.job4j.oop;

public class DummyDic {
    public static void engToRus(String eng){
        System.out.println("Неизвестное слово: " + eng);
    }
    public static void main(String[] args) {
        engToRus("home");
    }
}
