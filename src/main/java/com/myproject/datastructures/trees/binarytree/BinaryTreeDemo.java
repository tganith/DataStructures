package com.myproject.datastructures.trees.binarytree;

public class BinaryTreeDemo {

    public static void main(String args[]){

        BinaryTree bt = new BinaryTree();
        bt.insert(30);
        bt.insert(20);
        bt.insert(40);
        bt.insert(70);
        bt.insert(10);
        bt.insert(90);
        bt.insert(25);

       /* System.out.println("In Order Traversal:");
        bt.inOrderTraversal();
        System.out.println("\n---------------------------------------------------");

        System.out.println("Pre Order Traversal:");
        bt.preOrderTraversal();
        System.out.println("\n---------------------------------------------------");

        System.out.println("Post Order Traversal:");
        bt.postOrderTraversal();
        System.out.println("\n---------------------------------------------------");

        System.out.println("Level Order Traversal:");
        bt.levelOrderTraversal();
        System.out.println("\n---------------------------------------------------");

        System.out.println("Search Element:");
        bt.search(125);
        System.out.println("\n---------------------------------------------------");

        System.out.println("Count of Nodes:"+bt.countOfNodes());
        System.out.println("\n---------------------------------------------------");*/

        System.out.println("Level Order Traversal:");
        bt.levelOrderTraversal();
        System.out.println("\n---------------------------------------------------");

        System.out.println("Deepest Node:");
        bt.deepestNode();
        System.out.println("\n---------------------------------------------------");

        System.out.println("Delete Node:");
        bt.deleteNode(40);
        System.out.println("\n---------------------------------------------------");

        System.out.println("Level Order Traversal:");
        bt.levelOrderTraversal();
        System.out.println("\n---------------------------------------------------");

    }
}
