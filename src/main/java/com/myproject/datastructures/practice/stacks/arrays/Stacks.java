package com.myproject.datastructures.practice.stacks.arrays;

public class Stacks {

    int top = -1;
    int[] stacks = new int[5];

    public void push(int data) {

        if(top >= stacks.length -1){
            System.out.println("stack is full");
            return;
        }

        stacks[++top] = data;
    }


    public void display(){
        if(top < 0 ){
            System.out.println("stack is empty");
            return;
        }


        for(int i = top;i>=0;i--){
            System.out.print(stacks[i]+" ");
        }
    }

    public void pop(){
        if(top<0){
            System.out.println("stack is empty");
            return;
        }

        --top;
    }

    public int topElement(){
        if(top < 0 ){
            System.out.println("stack is empty");
            return -1;
        }

        return stacks[top];
    }
}
