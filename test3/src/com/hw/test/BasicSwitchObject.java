package com.hw.test;

public class BasicSwitchObject {

    public static void main(String[] args) {
        //valueOf("对象")静态方法，返回指定枚举类中的枚举值，即对象
        Gen g = Gen.valueOf("WOMEN");
        Log.d("对象：" + g + "     对象值：" + g.getSex() + "      索引值：" + g.ordinal());
        g.info();
        Log.d(g.toString());
    }
}
