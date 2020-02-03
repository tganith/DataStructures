package com.myproject.datastructures.queues;

public class QueuesArray {
    int[] queue = new int[5];
    int front = -1;
    int rear = 0;

    public void enQueue(int val) {
        if(queue.length-1<front){
            System.out.println("queue is full");
        }
        queue[++front] = val;
    }

    public void deQueue() {
        if(front < 0){
            System.out.println("queue is empty");
        }
        ++rear;
    }

    public int peek() {
        if(front < 0) {
            System.out.println("queue is empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        if(front < 0) {
            System.out.println("queue is empty");
            return true;
        }
        return false;
    }

    public void display(){
        for(int i =0;i<=front;i++) {
            System.out.println(queue[i]);
        }
    }


}
