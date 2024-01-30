package com.epam.rd.autotasks;

import org.junit.Test;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test
    public void testNullCase() {
        try {
            sorting.sort(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Array cannot be null", e.getMessage());
        }
    }

    @Test
    public void testEmptyCase() {
        int[] emptyArray = {};
        sorting.sort(emptyArray);
        assertArrayEquals(new int[]{}, emptyArray);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] singleElementArray = {5};
        sorting.sort(singleElementArray);
        assertArrayEquals(new int[]{5}, singleElementArray);
    }

    @Test
    public void testSortedArraysCase() {
        int[] sortedArray = {1, 2, 3, 4, 5};
        sorting.sort(sortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray);

        int[] reverseSortedArray = {5, 4, 3, 2, 1};
        sorting.sort(reverseSortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, reverseSortedArray);
    }

    @Test
    public void testOtherCases() {
        int[] unsortedArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        sorting.sort(unsortedArray);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9}, unsortedArray);
    }
}
