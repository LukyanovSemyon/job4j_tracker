package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void list() {
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> listInt = MatrixToList.list(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertThat(listInt, is(expected));
    }
}