package com.myproject.datastructures.sorting;

public class SelectionSort {

    public static void main(String args[]) {
        int[] arr= {10,40,20,60,80,30,0};
        int n = arr.length;
        int min;
        int temp;
        for(int i=0;i<n-1;i++){
            min = i ;
            for(int j = i+1;j<n;j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] =  temp;
        }

        for(int obj: arr){
             System.out.print(obj+" ");
        }


    }
}
