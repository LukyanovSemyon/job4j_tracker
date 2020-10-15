package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private int score;
    private String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }

    @Override
    public String toString() {
        return "Student{" + "score="
                + score + ", surname='"
                + surname + '\'' + '}';
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
        new Student(10, "Surname1"),
        new Student(20, "Surname2"),
        new Student(30, "Surname3"),
        new Student(40, "Surname4"),
        new Student(50, "Surname5"),
        new Student(60, "Surname6"),
        new Student(70, "Surname7"),
        new Student(80, "Surname8"),
        new Student(90, "Surname9")
        );
        Map<String, Integer> map = students.stream()
                .collect(Collectors.toMap(
                Student::getSurname,
                Student::getScore
        ));
        System.out.println(map);
    }
}
