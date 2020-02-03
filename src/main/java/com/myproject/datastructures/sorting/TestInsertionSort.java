package com.myproject.datastructures.sorting;

public class TestInsertionSort {

    public static void main(String args[]) {
        int[] arr= {10,400,20,60,80,70,130};


        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

        for(int obj: arr){
             System.out.print(obj+" ");
        }


    }
}
