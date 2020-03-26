package com.myproject.datastructures.trees.binarysearchtree;

public class BinarySearchTree {

    Node root;


    public void insert(int data) {
        root = insert(root,data);
    }

    private Node insert(Node node, int data) {
        Node newNode = new Node(data);
        if(node == null){
            node = newNode;
            return node;
        }

        if(node.data < data) {
            node.right = insert(node.right,data);
        } else{
            node.left = insert(node.left,data);
        }
        return node;
    }

    public void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }


    public void preOrderTraversal() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if(node == null){
            return;
        }

        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrderTraversal() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public void descendingOrder() {
        descendingOrder(root);
    }

    private void descendingOrder(Node node) {
        if(node == null){
            return;
        }

        descendingOrder(node.right);
        System.out.print(node.data+" ");
        descendingOrder(node.left);
    }

    public void search(int data) {
        boolean b = search(root,data);
        if(b){
            System.out.println("Element found");
        } else {
            System.out.println("Element Not found");
        }
    }

    private boolean search(Node node, int data) {
        boolean b = false;
        if(node == null){
            return b;
        }

        if(node.data<data){
            b = search(node.right,data);
        } else if(node.data>data) {
            b = search(node.left,data);
        } else {
            b = true;
        }
        return b;
    }

    public void delete(int data) {
        root = delete(root,data);
    }

    private Node delete(Node node, int data) {

        if(node == null){
            return node;
        }

        if(node.data<data){
          node.right =  delete(node.right,data);
        } else if(node.data>data){
          node.left =  delete(node.left,data);
        } else {
            if(node.right!=null && node.left!=null){
                Node temp = node;
                Node minNodeSuccessor = minNodeSuccessor(temp.right);
                node.data = minNodeSuccessor.data;
                node.right = delete(node.right,minNodeSuccessor.data);
            } else if(node.left!=null){
               return node.left;
            } else if(node.right!=null){
               return node.right;
            } else {
                node = null;
            }
        }
        return node;
    }

    private Node minNodeSuccessor(Node node) {
        if(node.left == null){
            return node;
        } else {
            return minNodeSuccessor(node.left);
        }
    }


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

}
