package com.myproject.datastructures.stacks.linkedlist;

public class StackLinkedList {

    Node top;

    StackLinkedList(){
        this.top = null;
    }


    public void push(int data){

        Node newNode = new Node(data);

        if(top == null){
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

    }


    public void pop(){

        if(top == null){
            System.out.println("stack is empty");
            return;
        }
               top = top.next;
    }

    public void display(){

        if(top == null){
            System.out.println("stack is empty");
            return;
        } else{
            Node traversalTemp = top;
            while(traversalTemp.next != null){
                System.out.println(traversalTemp.data);
                traversalTemp = traversalTemp.next;
            }
            System.out.println(traversalTemp.data);
        }
    }


    public int peek(){
        if(top == null){
            System.out.println("stack is empty");
            return -1;
        }
        return top.data;
    }



    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    }


}
