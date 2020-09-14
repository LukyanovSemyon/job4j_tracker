package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fullName;
    private int group;
    private Date matriculationDate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getMatriculationDate() {
        return matriculationDate;
    }

    public void setMatriculationDate(Date matriculationDate) {
        this.matriculationDate = matriculationDate;
    }
}
