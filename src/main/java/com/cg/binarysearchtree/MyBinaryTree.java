package com.cg.binarysearchtree;

public class MyBinaryTree <T extends Comparable<T>> {

    MyNode root;

    void add(T key) {
        root = add(root, key);
    }

    MyNode add(MyNode root, T key) {

        if (root == null)
        {
            root = new MyNode(key);
            return root;
        }

        if (root.data.compareTo(key)>0)
            root.leftchild = add(root.leftchild, key);
        else
            root.rightchild = add(root.rightchild, key);
        return root;
    }

    void display() {
        display(root);
    }

    void display(MyNode root) {
        if (root != null) {
            System.out.println(root.data);
            display(root.leftchild);
            display(root.rightchild);
        }
    }

}
