package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] arg) {
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек.\n" +
                "Выигрывает тот, кто забрал последние спички");
        int run = 11;
        boolean user = true;
        String name = null;
        while (run > 0) {
            name = user? "игрок_1" : "игрок_2";
                System.out.println("Ходит " + name);
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
            System.out.println("Выиграл: " + name);
    }
}
