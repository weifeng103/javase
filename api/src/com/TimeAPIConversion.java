package com;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class TimeAPIConversion {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Date from = Date.from(now);
        Date date = new Date();
        Instant instant = date.toInstant();
        System.out.println(from);
        System.out.println(instant);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
        LocalDate from1 = LocalDate.from(localDateTime);
        System.out.println(localDateTime);
        System.out.println(from1);

    }
}
