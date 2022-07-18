package com;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        int[] ints = Arrays.copyOf(array, array.length * 2);
        System.out.println(Arrays.toString(ints));

    }
}
