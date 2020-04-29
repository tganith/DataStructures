package com.myproject.datastructures.arrays;

import java.util.Arrays;

public class MergeTwoArrays1 {

    public static void main(String args[]) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60, 70, 80, 90, 100};

        int[] finalArray = new int[arr1.length+arr2.length];

        int count = 0;
        count = mergeArr(finalArray,arr1,count);
        mergeArr(finalArray,arr2,count);

        System.out.println(Arrays.toString(finalArray));
    }


    public static int mergeArr(int[] finalArr,int[] arr,int count){


        for(int x: arr){
            finalArr[count++]=x;
        }
        return count;
    }
}
