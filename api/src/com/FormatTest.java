package com;


import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String format1 = format.format(date);
        System.out.println(format1);
//        try {
//            System.out.println(format.parse("2022/7/6 下午5:52"));
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(DateUtil.nowString());
    }
}
