package com.myproject.datastructures.practice.stacks.linkedlist;

public class Stacks {

    Node top;

    public void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            return;
        }

        newNode.next = top;
        top = newNode;
    }

    public void display() {
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }

    public int peek() {
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    public void pop() {

        if(top == null){
            System.out.println("Stack is empty");
            return;
        }

        top = top.next;

    }


    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
}
