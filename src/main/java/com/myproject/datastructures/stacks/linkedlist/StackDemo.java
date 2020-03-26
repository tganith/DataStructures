package com.myproject.datastructures.stacks.linkedlist;

public class StackDemo {

    public static void main(String args[]) {

        StackLinkedList stack = new StackLinkedList();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        stack.display();


        System.out.println("stack peek value:"+stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
      //  stack.pop();

        stack.display();

    }


}
