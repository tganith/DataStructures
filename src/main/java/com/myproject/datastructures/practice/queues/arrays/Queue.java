package com.myproject.datastructures.practice.queues.arrays;

public class Queue {

    int[] queue = new int[5];

    int front = -1;
    int rear = -1;

    public void enQueue(int data){

        if(queue.length-1 <= rear){
            System.out.println("queue is full");
            return;
        }

        if(front == -1){
            front = 0;
        }
        queue[++rear] = data;
    }

    public void display(){
        if(front == -1){
            System.out.println("queue is empty");
            return;
        }

        for(int i = front;i<= rear;i++){
            System.out.print(queue[i]+" ");
        }
    }


    public void deQueue() {

        if(front == -1){
            System.out.println("queue is empty");
            return;
        }

        if(front == rear){
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }


}
