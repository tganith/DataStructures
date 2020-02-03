package com.myproject.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceEachElement {

    public static void main(String[] args) {
        int[] arr = {10,10,20,30,30,30};
        Map<Integer,Integer> map = new HashMap<>();

        for(int val :arr ) {
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            } else {
                map.put(val,1);
            }
        }

        System.out.println(map);
    }
}
