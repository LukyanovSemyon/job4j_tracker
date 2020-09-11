package ru.job4j.oop;

public class DummyDic {
    public static String engToRus(String eng){
        String answer = "Неизвестное слово: " + eng;
        return answer;
    }
    public static void main(String[] args) {
        String check1 = engToRus("home");
        String check2 = engToRus("house");
        System.out.println(check1);
        System.out.println(check2);
    }
}
