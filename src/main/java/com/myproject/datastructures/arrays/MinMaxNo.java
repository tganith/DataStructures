package com.myproject.datastructures.arrays;

public class MinMaxNo {

    public static void main(String args[]) {
        int[] arr = {1, 20, 50, 90,20,50,10};
/*
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;*/


        int min = arr[0];
        int max = arr[0];

        int n = arr.length;

        for(int i=0;i<n;i++) {
           if(arr[i] > max){
               max = arr[i];
           }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("min number is "+min);
        System.out.println("max number is "+max);

    }
}
