package com.myproject.datastructures.queues.linkedlist;

public class Queue {

    Node front;
    Node rear;


    public void enqueue(int data){
        Node node = new Node(data);

        if(rear == null){
            front = node;
            rear = node;
            return;
        }

        rear.next = node;
        rear =  node;
    }


    public void display(){
        if(front == null){
            System.out.println("queue is empty");
            return;
        }

        Node temp = front;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data+" ");
    }


    public void dequeue(){
        if(front == null){
            System.out.println("queue is empty");
            return;
        }

        front = front.next;

        if(front  == null){
            rear = null;
        }
    }

    public int peek(){
        if(front == null){
            System.out.println("queue is empty");
            return -1;
        }

        return front.data;
    }


    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }


}
