package com;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantTest {
    public static void main(String[] args) {
        // 显示世界统一时间
        Instant now = Instant.now();
        Instant plus = now.plus(Duration.ofDays(365));
        System.out.println(plus);
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("GMT+08:00"));
        System.out.println(zonedDateTime);

    }
}
