package com.myproject.datastructures.practice.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {


    public static void main(String args[]){

        int[] arr = { 14,12,70,15,99,65,21,90};

        int max = Integer.MIN_VALUE;
        for(int i = 1;i< arr.length;i++){
            int j = i-1;
 
            while(j>=0 && arr[j] < arr[i]){
                int diff = arr[i] - arr[j];
                if(diff > max){
                    max = diff;
                }
                j--;
            }
        }

       System.out.println(max);
    }

}
