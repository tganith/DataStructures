package com.myproject.datastructures.sorting;

public class MergeSort {

    public static void main(String args[]) {

          int[] arr = {5,4};

          mergeSort(arr,arr.length);

          for(int i = 0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }

    }

    private static void mergeSort(int[] arr,int length) {

        if(length < 2){
            return;
        }

        int mid = length/2;

        int[] left = new int[mid];
        int[]  right = new int[length - mid];

        int k = 0 ;
        for(int i = 0;i<length;i++){
            if(i<mid){
                left[i] = arr[i];
            } else {
                right[k++] = arr[i];
            }
        }

        mergeSort(left,mid);
        mergeSort(right,length-mid);
        merge(left,right,arr,mid,length-mid);

    }

    private static void merge(int[] left, int[] right, int[] arr, int left_size, int right_size) {


        int i = 0;
        int l = 0;
        int r = 0;

        while(l<left_size && r <right_size){
            if(left[l]<right[r]){
               arr[i++] = left[l++];
            } else {
               arr[i++] = right[r++];
            }
        }

        while(l<left_size){
            arr[i++] = left[l++];
        }

        while(r<right_size){
            arr[i++] = right[r++];
        }

    }


}
