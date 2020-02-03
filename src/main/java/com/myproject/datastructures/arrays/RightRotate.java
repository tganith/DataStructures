package com.myproject.datastructures.arrays;

public class RightRotate {

    public static void main(String args[]) {

        int[] arr = {1,2,3,4,5};
        int rotateCount = 6;

        int temp;
        int n = arr.length;

        for(int i = 0;i<rotateCount;i++){
              temp = arr[n-1];

              for(int j = n-1; j>0;j--){
                  arr[j] = arr[j-1];
              }

              arr[0] = temp;
        }

        for(int x : arr){
             System.out.print(x +" ");
        }
    }
}
