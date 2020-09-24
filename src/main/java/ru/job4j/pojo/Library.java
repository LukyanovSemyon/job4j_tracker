package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book warAhdPeace = new Book("War and Peace", 2120);
        Book annaKarenina = new Book("Anna Karenina", 1130);
        Book crimeAndPunishment = new Book("Crime and Punishment", 730);
        Book cleanCode = new Book("Clean code", 0);
        Book[] lib = new Book[4];
        lib[0] = warAhdPeace;
        lib[1] = annaKarenina;
        lib[2] = crimeAndPunishment;
        lib[3] = cleanCode;
        for (int index = 0; index < lib.length; index++) {
            Book pr = lib[index];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        System.out.println("Переставьте местами книги с индексом 0 и 3");
        lib[0] = cleanCode;
        lib[3] = warAhdPeace;
        for (int index = 0; index < lib.length; index++) {
            Book pr = lib[index];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        System.out.println("Добавьте цикл с выводом книг с именем \"Clean code\"");
        for (int index = 0; index < lib.length; index++) {
            Book pr = lib[index];
            if (pr.getName().equals("Clean code")) {
                System.out.println(pr.getName() + " - " + pr.getPages());
            }
        }
    }
}
