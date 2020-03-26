package com.myproject.datastructures.queues.arrays;

public class QueueDemo {

    public static void main(String args[]) {

        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        System.out.println("Dequeue Elements:");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println();
        queue.display();

        System.out.println();
        System.out.println("Top Element:"+ queue.peek());



    }
}
