package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThan0() {
        Fact.calc(-2);
    }
    @Test
    public void calc() {
        int rsl = Fact.calc(3);
        assertThat(rsl, is(6));
    }
}