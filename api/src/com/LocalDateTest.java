package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        int year = now.getYear();
        int i = now.lengthOfYear();
        int i1 = now.get(ChronoField.DAY_OF_WEEK);
        System.out.println(localTime);
        System.out.println(now);
        System.out.println(localDateTime);
        System.out.println(year);
        System.out.println(i);
        System.out.println(i1);
    }
}
