package com.cg.binarysearchtree;

public class MyNode <T extends Comparable<T>> {
    T data;
    MyNode leftchild;
    MyNode rightchild;

    public MyNode(T data) {
        this.data = data;
    }
}
