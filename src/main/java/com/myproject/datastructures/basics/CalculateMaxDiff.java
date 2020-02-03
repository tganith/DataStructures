package com.myproject.datastructures.basics;

public class CalculateMaxDiff {

    // 5,6,8,1,2,7
    public static void main(String args[]) {

       // int[] arr = {5,6,8,1,2,7,9};
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};

        int j  = 0;
        int max = -1;
        for(int i=1;i<arr.length;i++){
            j=i-1;

            while(j>=0 && arr[j] < arr[i]){
              int difference = arr[i] - arr[j];
              if(max < difference){
                  max = difference;
              }
              j= j-1;
            }

        }

        System.out.println(max);

    }

}
