package com.myproject.datastructures.trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarytTree {

    Node root;

    public void insert(int data) {

        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            Node presentNode = queue.remove();
            if(presentNode.left!=null && presentNode.right!=null){
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            } else {
                if(presentNode.left == null){
                    presentNode.left = newNode;
                } else {
                    presentNode.right = newNode;
                }
                break;
            }
        }
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

    public void levelOrderTraversal() {
        levelOrder(root);
    }

    private void levelOrder(Node node) {
        if(node!=null){
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                Node presentNode = queue.remove();
                System.out.print(presentNode.data+" ");

                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
    }

    public void search(int data) {

        boolean b = search(root,data);
        if(b){
            System.out.println("Element Found");
        } else{
            System.out.println("Element Not Found");
        }
    }

    private boolean search(Node node, int data) {
        boolean b = false;
        if (node != null) {
             Queue<Node> queue = new LinkedList<>();
             queue.add(root);

             while(!queue.isEmpty()){
                 Node presentNode = queue.remove();

                 if(presentNode.data == data){
                     b = true;
                     break;
                 } else {
                     if(presentNode.left!=null){
                         queue.add(presentNode.left);
                     }
                     if(presentNode.right!=null){
                         queue.add(presentNode.right);
                     }
                 }
             }

        }
        return b;
    }

    public int countOfNodes() {
        int count = 0;
        if(root!=null){
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node presentNode = queue.remove();
                ++count;
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        return count;
    }

    public void getDeepestNode() {
        Node  node = getDeepestNode(root);
        System.out.println("Testing deepest Node:"+node.data);
    }

    private Node getDeepestNode(Node node) {
        Node deepestNode = null;
        if(node!=null){
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                Node presentNode = queue.remove();

                if(presentNode.left == null && presentNode.right == null && queue.size() == 0){
                    deepestNode = presentNode;
                    break;
                } else{
                    if(presentNode.left!=null){
                        queue.add(presentNode.left);
                    }
                    if(presentNode.right!=null){
                        queue.add(presentNode.right);
                    }
                }
            }
        }
        return  deepestNode;
    }


    public void delete(int data){
        if(root!=null){

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                Node presentNode = queue.remove();

                if(presentNode.data == data){
                    Node deepestNode = getDeepestNode(root);
                    if(deepestNode == null) {
                        presentNode = null;
                    } else {
                        presentNode.data = deepestNode.data;
                        deleteDeepestNode();
                    }
                } else {
                    if(presentNode.left != null){
                        queue.add(presentNode.left);
                    }
                    if(presentNode.right != null){
                        queue.add(presentNode.right);
                    }
                }
            }
        }
    }


    private void deleteDeepestNode() {

        if(root !=null){

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            Node presentNode = null;
            Node prevNode;
            while(!queue.isEmpty()) {
                prevNode = presentNode;
                presentNode = queue.remove();

                while (!queue.isEmpty()) {
                    prevNode = presentNode;
                    presentNode = queue.remove();
                    if (presentNode.left == null) {
                        prevNode.right = null;
                        return;
                    } else if ((presentNode.right== null)) {
                        presentNode.left = null;
                        return;
                    }
                    queue.add(presentNode.left);
                    queue.add(presentNode.right);
                }
            }

        }
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
        }
    }
}
