package com.myproject.datastructures.practice.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]) {


        int[] arr = {5,4,3,2,1};

        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int start, int end) {

        if(start < end){

            int pivotal = partition(arr,start,end);
            quickSort(arr,start,pivotal-1);
            quickSort(arr,pivotal+1,end);

        }
    }

    private static int partition(int[] arr, int start, int end) {

        int i = start -1;
        int p = end;

        for(int j = start;j<=end;j++){
            if(arr[j]<=arr[p]){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return i;
    }


}
