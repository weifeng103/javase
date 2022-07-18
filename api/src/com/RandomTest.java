package com;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
//        int i = random.nextInt(101);
        byte[] bytes = new byte[12];
        random.nextBytes(bytes);
        random.ints(10).forEach(item -> {
            System.out.println(item);
        });
        System.out.println(Arrays.toString(bytes));
    }
}
