package com.myproject.datastructures.arrays;

public class MissingNumber {

    public static void main (String[] args) {

        int[] arr={1,3,4,5,6,7,8,9};
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++) {
            sum += arr[i];
        }

        int formula = (n + 1) * (n + 2) / 2;
        System.out.println("Missing number is "+(formula-sum));
    }

}
