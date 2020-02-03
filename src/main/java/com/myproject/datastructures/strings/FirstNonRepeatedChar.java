package com.myproject.datastructures.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static void main(String args[]) {
        String str = "easiest";

        Map<Character,Integer> map = new LinkedHashMap<>();
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
           if(count==1){
               System.out.println(mapObj.getKey());
               break;
           }
        }

    }

}
