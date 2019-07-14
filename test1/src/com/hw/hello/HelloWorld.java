package com.hw.hello;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        String[] s = new String[10];
        args = s;
        System.out.println(args.length);
    }
}
