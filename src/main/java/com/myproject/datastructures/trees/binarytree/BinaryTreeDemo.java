package com.myproject.datastructures.trees.binarytree;

public class BinaryTreeDemo {

    public static void main(String args[]) {
        BinarytTree bianryTree = new BinarytTree();
        bianryTree.insert(40);
        bianryTree.insert(20);
        bianryTree.insert(60);
        bianryTree.insert(10);
        bianryTree.insert(30);
        bianryTree.insert(50);
        bianryTree.insert(70);

      /*  System.out.println("In Order Traversal :");
        bianryTree.inOrderTraversal();
        System.out.println();

        System.out.println("Pre Order Traversal :");
        bianryTree.preOrderTraversal();
        System.out.println();

        System.out.println("Post Order Traversal :");
        bianryTree.postOrderTraversal();
        System.out.println();

        System.out.println("Level Order Traversal:");
        bianryTree.levelOrderTraversal();
        System.out.println();

        System.out.println("------------------------------------");*/


       /* System.out.print("Search: ");
        bianryTree.search(20);

        System.out.println("------------------------------------");

        System.out.println("Count of Nodes: "+bianryTree.countOfNodes());*/

        System.out.println("------------------------------------");

        System.out.println("Deepest Node:");
        bianryTree.getDeepestNode();

        System.out.println("------------------------------------");

        System.out.println("Delete Node:");
        bianryTree.delete(70);

        System.out.println("------------------------------------");

        System.out.println("In Order Traversal :");
        bianryTree.inOrderTraversal();
        System.out.println();

    }
}
