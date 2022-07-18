package com;


import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long l = new Date().getTime() + (2 * 60 * 60 * 1000);
        Date date2 = new Date(l);
        long time = date.getTime();
        System.out.println(date);
        System.out.println(date2);
        System.out.println(time);
        System.out.println("date.before(date2) = " + date.before(date2));

    }

}
