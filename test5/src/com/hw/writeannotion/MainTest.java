package com.hw.writeannotion;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class MainTest {

    private String uname;
    private Integer uage;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public static void main(String[] args){
        MainTest m = new MainTest();
        log.append(m.getUname());
        log.append(m.getUage().toString());
    }
}
