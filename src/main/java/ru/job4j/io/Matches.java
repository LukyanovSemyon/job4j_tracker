package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] arg) {
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек.\n" +
                "Выигрывает тот, кто забрал последние спички");
        int run = 11;
        int user = 1;
        int win = 0;
        while (run > 0) {
            System.out.println("Ход " + user + " игрока");
            Scanner input = new Scanner(System.in);
            int select = Integer.valueOf(input.nextLine());
            if (select > 3) {
                System.out.println("Неверное число. Введите число от 0 до 3\n Осталось " + run + "спичек");
            }else if(select < 1){
                System.out.println("Неверное число. Введите число от 0 до 3\n Осталось " + run + "спичек");
            }else {
                run = run - select;
                System.out.println("Осталось " + run + "спичек");
                win = user;

                if (user == 1)
                    user = 2;
                else user = 1;
            }
        }
        System.out.println("Выиграл " + win + "игрок");
    }
}
