package com.myproject.datastructures.arrays;

public class LeftRotate {

    public static void main(String args[]) {

        int[] arr = {1,2,3,4,5};
        int rotateCount = 2;

        int temp;
        int n = arr.length;

        for(int i = 0;i<rotateCount;i++){

            temp = arr[0];

            for(int j = 0;j<n-1;j++){
                arr[j] = arr[j+1];
            }

            arr[n-1] = temp;

        }

        for(int x : arr){
             System.out.print(x +" ");
        }
    }
}
