package com;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("0.1");
        BigDecimal add = bigDecimal.add(new BigDecimal("0.2"));
        System.out.println(add);
        System.out.println(CalculateUtil.plus(4.5, 7.8));
        System.out.println(CalculateUtil.minus(4.5, 7.8));
    }
}
