package com.myproject.datastructures.stacks.arrays;

public class StacksArrays {

    int[] stacks ;
    int top = -1;

    public StacksArrays(int size) {
       stacks = new int[size];
    }

    public void push(int obj) {
       if(stacks.length-1 <= top){
           System.out.println("stack is full");
           return;
       }

       stacks[++top] = obj;
    }

    public void pop() {
        if(top < 0){
            System.out.println("stack is empty");
        }
        --top;
    }

    public int topElement(){
        if(top < 0){
            System.out.println("stack is empty");
        }
        return stacks[top];
    }

    public boolean isEmpty(){
        if(top  ==  -1){
            return true;
        }
        return false;
    }
    
    public void dispalyStack(){
        for(int i=0;i<=top;i++){
            System.out.println(stacks[i]);
        }

    }


}

