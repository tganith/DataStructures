package com.myproject.datastructures.sorting;

public class BubbleSort {

    public static void main(String args[]) {
        int[] arr= {10,40,20,60,80,0};
        int n = arr.length;
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                 temp = arr[j];


                 arr[j] = arr[j+1];
                 arr[j+1] = temp;

                }
            }
        }

        for(int obj: arr){
             System.out.println(obj);
        }


    }
}
