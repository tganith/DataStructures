package com.myproject.datastructures.arrays;

public class TripleNumSum {


    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5,6};

        int keySum = 9;
        int n = arr.length;

        for(int i = 0;i<n-2;i++){
            for(int j = i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                   if(arr[i]+arr[j]+arr[k] == keySum){
                       System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                   }
                }
            }
        }


    }
}
