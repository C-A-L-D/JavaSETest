package com.hw.test;

public class Log {

    private Object one;

    public Log(Object one) {
        this.one = one;
    }

    public static void d() {
        System.out.println();
    }

    public static void d(Object one) {
        System.out.println(one);
    }
}
