package com.hw.basicAPI;

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

    public static void dd(Object one) {
        System.out.print(one);
    }
}
