package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//        String format = now.format(formatter);
//        System.out.println(format);
        LocalDate parse = LocalDate.parse("2022-07-11 08:29:32",formatter);
        System.out.println(parse);

    }
}
