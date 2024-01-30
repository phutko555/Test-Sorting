package com.epam.rd.autotasks;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(null);
    }

    @Test
    public void testEmptyCase() {
        int[] array = {};
        sorting.sort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array = {5};
        sorting.sort(array);
        assertArrayEquals(new int[]{5}, array);
    }

    @Test
    public void testSortedArraysCase() {
        int[] array = {1, 2, 3, 4, 5};
        sorting.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testOtherCases() {
        int[] array = {5, 3, 1, 4, 2};
        sorting.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }
}




