package com;

import java.math.BigDecimal;

public class CalculateUtil {
    public static double plus(double x, double y) {
        BigDecimal bigDecimal = new BigDecimal(Double.toString(x));
        BigDecimal y1 = bigDecimal.add(new BigDecimal(Double.toString(y)));
        return y1.doubleValue();
    }
    public static double minus(double x, double y) {
        BigDecimal bigDecimal = new BigDecimal(Double.toString(x));
        BigDecimal y1 = bigDecimal.subtract(new BigDecimal(Double.toString(y)));
        return y1.doubleValue();
    }
}
