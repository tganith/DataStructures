package com.myproject.datastructures.queues;

public class QueueArraysDemo {

    public static void main(String args[]) {

        QueuesArray queue = new QueuesArray();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.display();
        queue.deQueue();
        queue.deQueue();
        queue.display();

        System.out.println(queue.peek());

    }
}
