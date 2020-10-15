package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FunctionRangeTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionRange.diapason(5, 8, (x) -> 2 * x + 1);
        List<Double> expected = List.of(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        List<Double> result = FunctionRange.diapason(5, 8, (x) -> 3 * x * x + 4 * x + 5);
        List<Double> expected = List.of(100D, 137D, 180D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunction() {
        List<Double> result = FunctionRange.diapason(5, 8, (x) -> Math.pow(3, x));
        List<Double> expected = List.of(243D, 729D, 2187D);
        assertThat(result, is(expected));
    }
}