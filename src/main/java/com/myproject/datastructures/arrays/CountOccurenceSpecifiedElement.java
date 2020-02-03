package com.myproject.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountOccurenceSpecifiedElement {

    public static void main(String[] args) {
        int[] arr = {1,4,2,6,7,8,1,2,3,4,3,6};

        int n = arr.length -1;
        int count = 1;
        int findElement = 0;
        for(int i=0;i<n;i++) {
                 if(arr[i] == findElement){
                    count++;
             }
        }
        System.out.println(findElement+" element count is "+count);



    }
}
