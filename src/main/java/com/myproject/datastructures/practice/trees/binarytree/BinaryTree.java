package com.myproject.datastructures.practice.trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

   public void insert(int data){

        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);


        while(!queue.isEmpty()){
            Node temp = queue.remove();

            if(temp.left!=null && temp.right!=null){
                queue.add(temp.left);
                queue.add(temp.right);
            } else if(temp.left == null){
                temp.left = newNode;
                break;
            } else if(temp.right == null){
                temp.right = newNode;
                break;
            }
        }

    }

    public void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node != null){
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

    public void search(int data) {
       boolean b = searchElement(data);
       if(b){
           System.out.println("found Element");
       } else {
           System.out.println("Not found Element");
       }
    }

    private boolean searchElement(int data) {
       boolean b = false;

       if(root == null){
           return b;
       }

       Queue<Node> queue = new LinkedList<>();
       queue.add(root);

       while(!queue.isEmpty()){
           Node temp = queue.remove();
           if(temp.data == data){
               b = true ;
               break;
           } else {
               if(temp.left!=null){
                   queue.add(temp.left);
               }
               if(temp.right!=null){
                   queue.add(temp.right);
               }
           }
       }
       return b;
    }

    public void levelOrderTraversal() {
       if(root == null){
           return;
       }

       Queue<Node> queue = new LinkedList<>();
       queue.add(root);

       while(!queue.isEmpty()){
           Node temp = queue.remove();
           System.out.print(temp.data+" ");
           if(temp.left!=null){
               queue.add(temp.left);
           }
           if(temp.right!=null){
               queue.add(temp.right);
           }
       }

    }

    public int deepNode(){
       return deepestNode().data;
    }

    public Node deepestNode() {

       if(root == null){
           return null;
       }

       Queue<Node> queue = new LinkedList<>();
       queue.add(root);

       Node deepestNode = null;

       while(!queue.isEmpty()){
           Node temp = queue.remove();

           if(temp.left!=null){
               queue.add(temp.left);
           }

           if(temp.right!=null){
               queue.add(temp.right);
           }

           if(queue.size() == 0){
               deepestNode = temp;
           }
       }

       return deepestNode;
    }


    public void delete(int data){

       if(root == null){
           return;
       }

       Queue<Node> queue = new LinkedList<>();
       queue.add(root);

       while(!queue.isEmpty()){
           Node temp = queue.remove();

           if(temp.data == data){
               Node deepest = deepestNode();
               temp.data = deepest.data;
               deleteDeepestNode();
           } else{
               if(temp.left!=null){
                   queue.add(temp.left);
               }
               if(temp.right!=null){
                   queue.add(temp.right);
               }
           }

       }

   }

    public void deleteDeepestNode(){
       if(root!=null){

           Queue<Node> queue = new LinkedList<>();
           queue.add(root);

           Node prevNode = null;
           Node presentNode = null;
           while(!queue.isEmpty()){

               prevNode = presentNode;
               presentNode = queue.remove();

               if(presentNode.left == null){
                   if(prevNode!=null){
                       prevNode.right = null;
                   } else {
                      root = null;
                   }
                   return;
               } else if(presentNode.right  == null){
                   presentNode.left = null;
                   return;
               }

               queue.add(presentNode.left);
               queue.add(presentNode.right);

           }
       }
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
