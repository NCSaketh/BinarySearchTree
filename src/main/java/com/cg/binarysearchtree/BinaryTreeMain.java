package com.cg.binarysearchtree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        MyBinaryTree bst=new MyBinaryTree();
        //Creating BST
        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);
        bst.display();
        System.out.println("THE SIZE OF THE TREE IS "+ bst.size());
    }
}
