package com.myproject.datastructures.practice.stacks.linkedlist;

public class StackDemo {

    public static void main(String args[]) {

        Stacks stacks = new Stacks();
        stacks.push(10);
        stacks.push(20);
        stacks.push(30);
        stacks.push(40);
        stacks.push(50);

        stacks.display();

        System.out.println("\nTop Element: "+stacks.peek());

        stacks.pop();


        stacks.display();

    }
}
