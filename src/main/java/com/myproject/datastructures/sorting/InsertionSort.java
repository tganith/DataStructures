package com.myproject.datastructures.sorting;

import java.util.Arrays;

public class InsertionSort {

    // Time Complexity - O(n2)

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

        System.out.println(Arrays.toString(arr));

    }
}
