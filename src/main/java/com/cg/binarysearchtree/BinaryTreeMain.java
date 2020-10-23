package com.cg.binarysearchtree;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

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
        System.out.println("Tree size is "+ bst.size());

        System.out.println("Enter to search");
        int data=sc.nextInt();
        if(bst.search(data))
        {
            System.out.println("Search is Successful");
        }
        else
        {
            System.out.println("Search Unsuccessful");
        }
    }
}
