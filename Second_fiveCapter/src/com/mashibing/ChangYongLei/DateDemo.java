package com.mashibing.ChangYongLei;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws Exception {
        Date date=new Date();
        System.out.println(date);//Mon Mar 23 12:47:08 CST 2020
        System.out.println(date.getTime());//1584938828488
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 2020-03-23 12:47:08    不同的字母代表不同的意义   y:年   其实写一个y就行  这样写为了看起来规范
        dateFormat.format(date);//Sat Oct 10 20:20:20 CST 2020
        //将Date类按照规范转换成字符串格式
        String str=dateFormat.format(date);
        System.out.println(str);
        //将字符串转换成日期类
        Date d1=dateFormat.parse("2020-10-10 20:20:20");
        System.out.println(d1);

        //获取的是当前系统的时间
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        //设置指定时间的日历类
        calendar.setTime(d1 );
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

    }
}
