package com.myproject.datastructures.arrays;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String args[]) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60, 70, 80, 90, 100};

        int[] finalArray = new int[arr1.length+arr2.length];

        int count = 0;
        for(int i = 0;i<arr1.length;i++){
            finalArray[count++] = arr1[i];
        }

        for(int i = 0;i<arr2.length;i++){
            finalArray[count++] = arr2[i];
        }

        System.out.println(Arrays.toString(finalArray));
    }
}
