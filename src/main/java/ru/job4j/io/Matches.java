package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] arg) {
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек.\n" +
                "Выигрывает тот, кто забрал последние спички");
        int run = 11;
        boolean user = true;
        while (run > 0) {
            if (user){
                System.out.println("Ход 1 игрока");
            }else
                System.out.println("Ход 2 игрока");
            Scanner input = new Scanner(System.in);
            int select = Integer.valueOf(input.nextLine());
            if (select > 3 || select < 1) {
                System.out.println("Неверное число. Введите число от 0 до 3\n Осталось спичек: " + run);
            }else if(select > run){
                System.out.println("Неверное число. Введите число от 0 до "+ run + "\nОсталось спичек: " + run);
            }else{
                run = run - select;
                System.out.println("Осталось спичек: "+ run);
                user = !user;
            }
        }
        if (user){
            System.out.println("Выиграл 2 игрок");
        }else
            System.out.println("Выиграл 1 игрок");
    }
}
