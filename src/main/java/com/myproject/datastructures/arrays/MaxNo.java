package com.myproject.datastructures.arrays;

public class MaxNo {

    public static int calculation(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String args[]) {
        int[] arr = {100, 20, 50, 90};
        int  max = calculation(arr);
        System.out.println(max);
    }
}
