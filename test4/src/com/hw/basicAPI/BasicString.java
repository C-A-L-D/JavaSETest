package com.hw.basicAPI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class BasicString {

    public static void main(String[] args) {
        //chaAt(int index) 获取index+1的字符
        //concat(String str) 追加字符串
        //equals(Object)
        //length()
        //valueOf()
        //getBytes() 将字符串转化为byte数组
        //toCharArray() 将字符串转化为char数组
        //toLowerCase() 将大写转小写
        //toUpperCase() 将小写转化为大写
        //getChars(int begin,int end,char[] dst,int dstBegin) 将begin到end的字符复制到从dstend开始的dst字符数组
        ////////////indexOf(String str) 找出字符串第一次出现的位置
        //indexOf(String str,int fromindex) 找出字符串在位置fromindex+1后面第一次出现的位置
        //indexOf(char c) 找出字符第一次出现的位置
        //lastIndexOf(...)同理
        ////////////startsWith(String str) 判断字符串是否以str开头
        //startsWith(String str,int fromindex) 从fromindex位置开始算起，判断字符串是否以str开头
        //endsWith(...) 同理
        //replace(char oldChar,char newChar newChar) 字符串的字符串oldChar替换成newChar
        //substring(int beginIndex) 获取从beginIndex的字符串
        //compareTo(String str) 比较两个字符串的大小（字符串包含另一个字符串的所有内容，则返回多出的长度；若不包含，则比较第一个不同的字符大小）

    }
}
