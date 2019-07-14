package com.hw.basicAPI;

import java.util.Objects;

public class BasicObjectTest{

    private static class BasicObject{
        private String name;

        public BasicObject(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            //getclass是反射中的获取类对象的方法
            if (o == null || getClass() != o.getClass())
                return false;
            BasicObject that = (BasicObject) o;
            /*Objects类的toString方法
            public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
            }*/
            return Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "name:" + name;
        }
    }

    public static void main(String[] args) {
        BasicObject b = new BasicObject("jun");
        BasicObject bb = new BasicObject("jun");
        Log.d(b.toString());
        Log.d(b == bb);     //false
        Log.d(b.equals(bb));    //true
        Log.d("123".equals("123")); //true  String类已重写
        Integer a = new Integer(5);
        Integer c = new Integer(5);
        Log.d(a.equals(c));     //true  Integer已重写
        Log.d(a==c);        //false
    }
}