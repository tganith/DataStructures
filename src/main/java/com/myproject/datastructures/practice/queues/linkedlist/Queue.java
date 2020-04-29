package com.myproject.datastructures.practice.queues.linkedlist;

public class Queue {

    Node front;
    Node rear;

    public void enQueue(int data) {
      Node newNode = new Node(data);
        if(rear == null){
          rear = newNode;
          front = newNode;
          return;
      }

        rear.next = newNode;
        rear = newNode;
    }

    public void display(){
        if(front == null){
            System.out.println("Queue is empty");
             return;
        }

        Node temp = front;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }

    public void deQueue() {
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }

        if(front!=rear){
            front = front.next;
        } else {
            front = null;
            rear = null;
        }


    }

    public int  peek() {
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }


    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
}
