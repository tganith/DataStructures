package com.myproject.datastructures.queues.arrays;

public class Queue {

   int front = -1;
   int rear = -1;

   int[] queue = new int[5];

   public void enQueue(int data){

       if(rear >= queue.length){
           System.out.println("queue is full");
           return;
       }

       if(front == -1){
           queue[++rear] = data;
           ++front;
           return;
       }

       queue[++rear] = data;


   }

    public void deQueue(){

       if(front == -1){
           System.out.println("queue is empty");
           return;
       }

       if(front == rear){
           front = -1;
           rear = -1;
           return;
       }

       front++;

    }


    public void display(){

       if(front == -1){
           System.out.println("queue is full");
           return;
       }

       for(int i = front;i<=rear;i++){
           System.out.print(queue[i]+" ");
       }

    }

}
