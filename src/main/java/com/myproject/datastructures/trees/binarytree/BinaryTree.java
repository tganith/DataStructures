package com.myproject.datastructures.trees.binarytree;

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

              if(temp.left!=null && temp.right !=null){
                  queue.add(temp.left);
                  queue.add(temp.right);
              } else {
                  if(temp.left == null) {
                      temp.left = newNode;
                  } else {
                      temp.right = newNode;
                  }
                  break;
              }
        }
    }


    public void inOrderTraversal(){
        inOrder(root);
    }

    private void inOrder(Node root) {
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public void preOrderTraversal(){
        preOrder(root);
    }

    private void preOrder(Node root) {
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    public void postOrderTraversal(){
        postOrder(root);
    }

    private void postOrder(Node root) {
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public void search(int data) {
        boolean b = searchElement(data);
        if(b){
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not found");
        }
    }

    public boolean searchElement(int data){
        boolean b = false;

        if(root== null){
            return b;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp!=null){
                if(temp.data == data){
                    b = true;
                    break;
                } else {
                    if(temp.left !=null && temp.right!=null){
                        queue.add(temp.left);
                        queue.add(temp.right);
                    } else if(temp.left!=null){
                        queue.add(temp.left);
                    } else{
                        queue.add(temp.right);
                    }
                }
            }

        }

        return b;
    }

    public void levelOrderTraversal() {
        levelOrder(root);
    }

    public int countOfNodes() {

        int count = 0;
        if(root == null){
            return count;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp!=null){
                ++count;
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }

        return count;
    }

    public void levelOrder(Node root){

        if(root==null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp!=null){
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }
    }

    public void deepestNode() {
        Node node = deepestNode(root);
        if(node!=null){
            System.out.println(node.data);
        } else {
            System.out.println("No data Found");
        }
    }

    public Node deepestNode(Node node){
        Node deepestNode = null;

        if(node == null){
          return deepestNode;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.remove();

            if(temp.left == null && temp.right == null && queue.size() == 0){
                deepestNode = temp;
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

        return deepestNode;
    }

    public void deleteNode(int data) {

        if(root == null){
            System.out.println("Tree is empty");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.remove();

            if(temp.data == data){
                Node deepestNode = deepestNode(root);
                temp.data = deepestNode.data;
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

    private void deleteDeepestNode() {
        if(root!=null){
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            Node prevNode = null;
            Node presentNode = null;
            while(!queue.isEmpty()){
                prevNode = presentNode;
                presentNode = queue.remove();

                if(presentNode.left  == null){
                    prevNode.right = null;
                    return;
                } else if(presentNode.right == null){
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
