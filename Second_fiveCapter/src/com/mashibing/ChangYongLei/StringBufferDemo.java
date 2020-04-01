package com.mashibing.ChangYongLei;

/**
 *
 * 可变字符
 *    StringBuffer ：线程安全，效率低
 *    StringBuilder：线程不安全，效率高
 *
 *
 *
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(1).append(1.234).append("abc").append(true);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());//  13  当前放置在数组中整体占用的一个大小
        System.out.println(stringBuffer.capacity());//16   区分这两个
        StringBuilder stringBuilder=new StringBuilder();
        stringBuffer.append("123").append(1).append(false);
        System.out.println(stringBuilder);
    }
}
