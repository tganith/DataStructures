package com.myproject.datastructures.practice.trees.binarytree;

public class BinaryTreeDemo {

    public static void main(String args[]){

        BinaryTree bt = new BinaryTree();
        bt.insert(40);
        bt.insert(20);
        bt.insert(15);
        bt.insert(70);
        bt.insert(50);
        bt.insert(35);
        bt.insert(60);


      /*  System.out.println("In Order:");
        bt.inOrderTraversal();

        System.out.println("\n Pre Order:");
        bt.preOrderTraversal();


        System.out.println("\n Post Order:");
        bt.postOrderTraversal();

        System.out.println("\n Level Order:");
        bt.levelOrderTraversal();

        System.out.println("\n Search Element:");
        bt.search(20);*/


        //bt.delete(); bt.deleteDeepestNode();

    //    System.out.println(bt.deepNode());

     //   bt.deleteDeepestNode();

        bt.delete(20);
        bt.levelOrderTraversal();
    }
}
