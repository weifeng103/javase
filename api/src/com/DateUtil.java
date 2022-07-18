package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static Date now() {
        return new Date();
    }
    public static Date now(String date){
        SimpleDateFormat format = new SimpleDateFormat();
        try {
            return format.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public static String nowString() {
        return nowString(DATE_FORMAT);
    }
    public static String nowString(String pattern) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern(pattern);
        String format1 = format.format(date);
        return format1;
    }
}

