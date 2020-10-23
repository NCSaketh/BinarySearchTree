package com.cg.binarysearchtree;

public class MyNode <T extends Comparable<T>> {
    T data;
    MyNode left_child;
    MyNode right_child;

    public MyNode(T data) {
        this.data = data;
    }
}
