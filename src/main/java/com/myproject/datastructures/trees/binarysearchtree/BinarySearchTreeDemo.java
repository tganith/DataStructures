package com.myproject.datastructures.trees.binarysearchtree;

public class BinarySearchTreeDemo {


    public static void main(String args[]) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(10);
        bst.insert(90);
        bst.insert(25);


      /*  System.out.println("In Order Traversal:");
        bst.inOrderTraversal();
        System.out.println();

        System.out.println("Pre Order Traversal:");
        bst.preOrderTraversal();
        System.out.println();

        System.out.println("Post Order Traversal:");
        bst.postOrderTraversal();
        System.out.println();

        System.out.println("--------------------------------------------");

        System.out.println("descending Sorting:");
        bst.descendingOrder();
        System.out.println();

        System.out.println("--------------------------------------------");
        bst.search(30);
        System.out.println("--------------------------------------------");*/

        bst.delete(30);
        bst.inOrderTraversal();

    }


}
