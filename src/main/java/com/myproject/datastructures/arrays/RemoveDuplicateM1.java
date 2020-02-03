package com.myproject.datastructures.arrays;

public class RemoveDuplicateM1 {
    public static int removeDuplicateElements(int arr[]){
        int n = arr.length;
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array\O

        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main (String[] args) {
        // it should be sorted order
        int arr[] = {10,20,20,30,30,40,50,50,60};
        int length = arr.length;

        length = removeDuplicateElements(arr);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }


}
