package com.myproject.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {

    public static void main(String args[]) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            } else {
                map.put(key,1);
            }
        }

        for(Map.Entry<Integer,Integer> mapObj : map.entrySet()){
            if(mapObj.getValue()  == 1 ) {
                System.out.println(mapObj.getKey());
            }
        }
    }
}
