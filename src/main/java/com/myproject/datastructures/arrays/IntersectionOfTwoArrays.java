package com.myproject.datastructures.arrays;

public class IntersectionOfTwoArrays {


    public static void main(String args[]) {
        int[] arr1 = {100, 20, 50, 90,40};
        int[] arr2 = {10, 200, 50, 9,40};

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }

}
