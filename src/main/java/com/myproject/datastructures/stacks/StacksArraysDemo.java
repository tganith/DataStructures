package com.myproject.datastructures.stacks;

public class StacksArraysDemo {

    public static void main(String args[]) {
        StacksArrays stacks = new StacksArrays(5);
        stacks.push(100);
        stacks.push(200);
        stacks.push(300);

     //   stacks.pop();

        System.out.println("top element:"+stacks.topElement());

        stacks.dispalyStack();

    }

}
