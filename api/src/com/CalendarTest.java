package com;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("GMT+01:00")));
        calendar.set(2003, 2, 22, 00, 00);
        calendar.set(Calendar.YEAR, 2008);
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        // calendar 的月份从0开始的
        int month = calendar.get(Calendar.MONDAY);
        int year = calendar.get(Calendar.YEAR);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + (month + 1) + "月" + day + "日" + Calendar.HOUR + "点");
        Date time = calendar.getTime();
        calendar.setTime(time);
        System.out.println(time);
        System.out.println(calendar.getTimeZone());

    }
}
