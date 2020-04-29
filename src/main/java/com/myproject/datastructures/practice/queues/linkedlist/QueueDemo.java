package com.myproject.datastructures.practice.queues.linkedlist;

public class QueueDemo {

    public static void main(String args[]){

        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        queue.display();

        queue.deQueue();
     //   queue.deQueue();


        System.out.println("\n");
        queue.display();

        System.out.println("\n");

        System.out.println(queue.peek());

    }

}
