package com.epam.rd.autotasks;

public class Sorting {

    public void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException();
        }
        java.util.Arrays.sort(array);
    }
}
