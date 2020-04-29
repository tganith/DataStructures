package com.myproject.datastructures.practice.trees.binarysearchtree;

public class BSTDemo {


    public static void main(String args[]){

        BST bst = new BST();
        bst.insert(30);
        bst.insert(40);
        bst.insert(20);
        bst.insert(10);
        bst.insert(5);
        bst.insert(70);
        bst.insert(35);
        bst.insert(25);


        System.out.println("In Order Traversal:");
        bst.inOrderTraversal();

       /* System.out.println("\nPre Order Traversal:");
        bst.preOrderTraversal();


        System.out.println("\nPost Order Traversal:");
        bst.postOrderTraversal();

        System.out.println("\nDescending Order:");
        bst.descendingOrder();

        System.out.println();
        bst.search(56);*/

        System.out.println("\n");

        bst.delete(30);

        bst.inOrderTraversal();


    }
}
