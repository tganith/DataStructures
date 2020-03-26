package com.myproject.datastructures.sorting;

import java.util.Arrays;

public class MergeSort {

    static int[] temp = new int[5];
    static int[] result = new int[5];

    public static void main(String args[]) {

        int[] arr = {5,4,3,2,1};

        mergeSort(arr,0,arr.length-1);


        System.out.println(Arrays.toString(result));

    }

    private static void mergeSort(int[] arr, int lb, int ub) {

        if(lb<ub){
           int mid = (lb+ub)/2;
           mergeSort(arr,0,mid);
           mergeSort(arr,mid+1,ub);
           merge(arr,lb,mid,ub);
        }

    }

    private static void merge(int[] arr, int lb, int mid, int ub) {

        int i = lb;
        int j = mid+1;
        int k = lb;

        while(i<=mid && j <= ub){
             if(arr[i]<=arr[j]){
                 temp[k] = arr[i];
                 i++;
             } else {
                 temp[k] = arr[j];
                 j++;
             }
             k++;
        }

        if(i>mid){
                while(j<=ub){
                   temp[k] = arr[j];
                   j++;
                   k++;
                }
        } else {
            while(i<=mid){
                 temp[k] = arr[i];
                 i++;
                 k++;
            }
        }

        for(int m = lb;m<=ub;m++){
            result[m] = temp[m];
        }


    }


}
