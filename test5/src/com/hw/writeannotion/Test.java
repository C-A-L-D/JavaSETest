package com.hw.writeannotion;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test {

    public void dealAnnottion() {
        try {
            Field[] t = MainTest.class.getFields();
            for (Field tt: t) {


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
