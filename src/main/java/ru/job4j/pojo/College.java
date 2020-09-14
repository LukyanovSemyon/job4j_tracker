package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup(5);
        student.setMatriculationDate(new Date());

        System.out.println(student.getFullName() + " matriculated to the group number: " + student.getGroup() + " on " + student.getMatriculationDate());
    }
}
