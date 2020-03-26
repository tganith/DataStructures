package com.myproject.datastructures.queues.arrays;

public class Queue {

    int front = -1;
    int rear = -1;
    int[] queue = new int[5];

    public void enqueue(int data) {

        if(rear>=queue.length){
            System.out.println("Queue is full");
            return;
        }

        if(rear == -1){
            queue[++rear] = data;
            ++front;
        } else {
            queue[++rear] = data;
        }
    }

    public void display(){

        if(rear == -1){
            System.out.println("queue is empty");
            return;
        }

        for(int i=front;i<=rear;i++){
              System.out.print(queue[i]+" ");
        }

    }

    public void dequeue() {
        if(rear == -1){
            System.out.println("queue is empty");
            return;
        }

        if(front<queue.length){
            ++front;
        }

        if(front == queue.length){
            front = -1;
            rear = -1;
        }

    }

    public int peek() {

        if(rear == -1){
            System.out.println("queue is empty");
            return -1;
        }
        return queue[front];
    }
}
