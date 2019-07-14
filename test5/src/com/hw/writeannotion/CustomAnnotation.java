package com.hw.writeannotion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface CustomAnnotation{
    String name() default "我是默认";
    int age() default 100;
}
