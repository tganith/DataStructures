package com.myproject.datastructures.arrays;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecondSmallest {

    public static void main (String[] args) {

        int[] arr={1,20,30,10};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int n = arr.length;

        for(int i =0;i<n;i++){

                if(arr[i]<smallest){
                    secondSmallest = smallest;
                    smallest = arr[i];

                } else if(arr[i]<secondSmallest){
                    secondSmallest = arr[i];

            }
        }
        System.out.println("smallest value is "+smallest);
        System.out.println("second smallest value is "+secondSmallest);


        Map<Integer,String> map = new HashMap<>();
        map.put(10,"ganihta");
    }

}
