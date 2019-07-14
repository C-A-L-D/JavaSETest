package com.hw.test;


public enum Gen implements GenderDesc {
    MAN("男"){
        @Override
        public void info() {
            Log.d("帅！！！！！！！！！");
        }
    },
    WOMEN("女"){
        @Override
        public void info() {
            Log.d("美！！！！！！！！！");
        }
    };
    private final String sex;

    private Gen(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
