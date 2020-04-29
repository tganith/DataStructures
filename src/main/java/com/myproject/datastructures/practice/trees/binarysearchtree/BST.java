package com.myproject.datastructures.practice.trees.binarysearchtree;

public class BST {

    Node root;

    public void insert(int data){
        root = insert(root,data);
    }

    public Node insert(Node node,int data){
        Node newNode = new Node(data);

        if(node == null){
            return newNode;
        }

        if(node.data < data){
            node.right = insert(node.right,data);
        } else {
            node.left = insert(node.left,data);
        }
        return node;
    }

    public void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }

    public void preOrderTraversal() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if(node!=null){
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrderTraversal() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+" ");
        }
    }

    public void descendingOrder() {
        descending(root);
    }

    private void descending(Node node) {
        if(node!=null){
            descending(node.right);
            System.out.print(node.data+" ");
            descending(node.left);
        }
    }

    public void search(int data){
        boolean b = searchElement(root,data);
        if(b){
            System.out.println("found element");
        } else {
            System.out.println("element not found ");
        }
    }

    public boolean searchElement(Node node,int data){

        boolean b = false;

        if(node!=null){
            if(node.data == data){
                b = true;
            } else if(node.data < data) {
                b = searchElement(node.right,data);
            } else {
                b = searchElement(node.left,data);
            }
        }

        return b;
    }

    public void delete(int data) {

        root = delete(root,data);

    }

    private Node delete(Node node,int data) {
        if(node == null){
            return node;
        }

        if(node.data < data){
            node.right = delete(node.right,data);
        } else if(node.data > data) {
            node.left = delete(node.left,data);
        } else {

            if(node.left!=null && node.right!=null) {
              Node successorNode = getSuccessor(node.right);
              node.data = successorNode.data;
              node.right = delete(node.right,successorNode.data);
            } else if(node.left!=null){
                return node.left;
            } else if(node.right !=null){
                return node.right;
            } else {
                return null;
            }
        }

        return node;
    }

    private Node getSuccessor(Node node) {
        if(node.left!=null){
            return getSuccessor(node.left);
        }
        return node;
    }

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
}
