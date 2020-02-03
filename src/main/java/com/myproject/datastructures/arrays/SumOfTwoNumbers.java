package com.myproject.datastructures.arrays;

public class SumOfTwoNumbers {

    public static void main(String args[]) {
        int[] arr = {2,4,3,5,6,-2,4,7,8,9};
        int n = arr.length;
        int sum = 0;
        int key = 7 ;

        for(int i = 0; i<n-1;i++){
           for(int j = i+1 ;j<n;j++){
               sum = arr[i] + arr[j];
               if(sum == key) {
                   System.out.println(arr[i]+","+arr[j]);
               }
           }
        }


    }
}
