package com.myproject.datastructures.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharFromString {

    public static void main(String args[]) {
        String str = "ganitha reddy";

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);

            } else {
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> mapObj:map.entrySet()){
           int count = mapObj.getValue();
           if(count>1){
               System.out.println(mapObj.getKey()+":"+count);
           }
        }

    }

}
