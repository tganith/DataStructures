package com.myproject.datastructures.queues.linkedlist;

public class QueueDemo {

    public static void main(String args[]) {

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.display();

        System.out.println();

        System.out.println("-------------------------------------------------");

        System.out.println("Deleted Elements:");

      /*  queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();*/
    //    queue.dequeue();


        queue.display();

        System.out.println();

        System.out.println("-------------------------------------------------");


        System.out.println("Peek Elements:"+queue.peek());

    }
}
