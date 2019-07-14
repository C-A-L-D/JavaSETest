package com.hw.basicAPI;

import java.util.Scanner;

public class ScannerAPI {

    public static void main(String[] args) {
        //System.in代表标准输入，即键盘输入
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();   //nextLine()是返回字符串，nextInt()返回整数，....
        System.out.println(s);
        String ss = scan.next();
        System.out.println(ss);
        while (scan.hasNext()){    //hasNext()判断是否有下一个字符串，hasNextInt()判断是否有下一个整数，......
            System.out.println("键盘输入的是：" + scan.next());
        }

    }
}
