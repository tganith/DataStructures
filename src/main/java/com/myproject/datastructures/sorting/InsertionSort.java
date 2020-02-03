package com.myproject.datastructures.sorting;

public class InsertionSort {

    public static void main(String args[]) {
        int[] arr= {10,400,20,60,80,70,130};
        int n = arr.length;
        int temp;
        int j;
        for(int i=1;i<n;i++){
            temp  = arr[i];
            j = i - 1;
            while(j>=0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = temp;
        }

        for(int obj: arr){
             System.out.print(obj+" ");
        }


    }
}
