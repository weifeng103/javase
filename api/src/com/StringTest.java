package com;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1).append(2).insert(1,3).reverse();
        System.out.println(stringBuilder);
    }
}
