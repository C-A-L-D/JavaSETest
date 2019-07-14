package com.hw.generics;

public class GenericsMainTest {

    public static void main(String[] args) {
        GenericsParent g = new GenericsParent<String>("《三国演义》");
        System.out.println(g.getInfo());
        GenericsParent gg = new GenericsParent<Float>(12.50F);
        System.out.println(gg.getInfo());
    }
}
