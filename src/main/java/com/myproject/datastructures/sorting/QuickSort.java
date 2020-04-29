package com.myproject.datastructures.sorting;

public class QuickSort {

    public static void main(String args[]) {

          int[] arr = {5,4,3,2,1};

          quickSort(arr,0,arr.length-1);

          for(int i = 0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }

    }

    private static void quickSort(int[] arr, int start, int end) {

        if(start<end){
            int pivot = partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }

    private static int partition(int[] array, int p, int q) {
        int pivot = q;
        int i = p-1;
        for (int j = p; j <= q; j++) {
            if (array[j] <= array[pivot]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }


}
