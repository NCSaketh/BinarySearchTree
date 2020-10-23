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
            root.left_child = add(root.left_child, key);
        else
            root.right_child = add(root.right_child, key);
        return root;
    }

    void display() {
        display(root);
    }

    void display(MyNode root) {
        if (root != null) {
            System.out.println(root.data);
            display(root.left_child);
            display(root.right_child);
        }
        else
        {
            System.out.print(" ");
        }
    }

    public int size()
    {
        return(size(root));
    }

    public int size(MyNode node) {
        if (node == null)
            return(0);
        else {
            return(size(node.left_child) + 1 + size(node.right_child));
        }
    }

}
