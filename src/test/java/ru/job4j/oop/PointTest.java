package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0,0);
        Point b = new Point(3,5);
        double rsl = a.distance3d(b);
        assertThat(rsl, is(5.83));
    }

    @Test
    public void distance3d() {
        Point a = new Point(0,0,0);
        Point b = new Point(3,6,9);
        double rsl = a.distance3d(b);
        assertThat(rsl, is(11.22));
    }
}
