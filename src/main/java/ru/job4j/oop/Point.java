package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        double result = sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
        return (double) Math.round(result * 100) / 100;
    }

    public double distance3d(Point that) {
        double result = sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2)
                + pow(this.z - that.z, 2));
        return (double) Math.round(result * 100) / 100;
    }
}

