package com.myproject.datastructures.arrays;

public class ReverseArraysOfNumbers {

    // reverse array integer
    public static void main(String args[]) {
        int[] n = {5,4,3,7,8};

        for(int i=n.length-1;i>=0;i--){
            System.out.print(n[i]+" ");
        }
    }
}
