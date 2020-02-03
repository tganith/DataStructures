package com.myproject.datastructures.arrays;

import java.util.Arrays;

public class SearchParticularValue {

    public static void main(String args[]) {
        int[] arr = {10,50,30,80,20,60};
        int searchKey = 60;
        int n = arr.length;
        boolean isKeyFound = false;

        for(int i =0; i<n;i++){
            if(searchKey == arr[i]) {
                isKeyFound = true;
                System.out.println("key found at "+ i+" th index");
                break;
            }
        }

        if(!isKeyFound){
            System.out.println("not found");
        }
    }
}
