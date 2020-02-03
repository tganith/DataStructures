package com.myproject.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateM2 {

    public static void main (String[] args) {

        int arr[] = {100,20,20,30,30,40,50,50,100,50};

        Map<Integer,Integer> map = new HashMap<>();

        for(int key : arr){
            if(!map.containsKey(key)){
                map.put(key,1);
            }
        }

        for(Map.Entry<Integer,Integer> mapObj: map.entrySet() ){
                System.out.println(mapObj.getKey());
        }

    }


}
