package com.hw.generics;

public class GenericsParent<T> {

    private T book;

    public GenericsParent(T book) {
        this.book = book;
    }

    public T getInfo(){
        return book;
    }

}
