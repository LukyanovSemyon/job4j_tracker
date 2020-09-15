package ru.job4j.pojo;

public class Library {
    public static void main (String[] args){
        Book WarAhdPeace = new Book("War and Peace", 2120);
        Book AnnaKarenina = new Book("Anna Karenina", 1130);
        Book CrimeAndPunishment = new Book("Crime and Punishment", 730);
        Book CleanCode = new Book("Clean code", 0);
        Book[] lib = new Book[4];
        lib[0] = WarAhdPeace;
        lib[1] = AnnaKarenina;
        lib[2] = CrimeAndPunishment;
        lib[3] = CleanCode;
        for (int index = 0; index < lib.length; index++) {
            Book pr = lib[index];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        System.out.println("Переставьте местами книги с индексом 0 и 3");
        lib[0] = CleanCode;
        lib[3] = WarAhdPeace;
        for (int index = 0; index < lib.length; index++) {
            Book pr = lib[index];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        System.out.println("Добавьте цикл с выводом книг с именем \"Clean code\"");
        for (int index = 0; index < lib.length; index++) {
            Book pr = lib[index];
            if (pr.getName() == "Clean code") {
                System.out.println(pr.getName() + " - " + pr.getPages());
            }
        }
    }
}
