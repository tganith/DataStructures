package com.myproject.datastructures.strings;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesCharEach {

    public static void main(String args[]) {
            String str = "ganitha";
            Map<Character,Integer> map = new HashMap<>();

            for(int i =0;i<str.length();i++){
                char c = str.charAt(i);
                 if(map.containsKey(c)){
                     map.put(c,map.get(c)+1);
                 } else {

                     map.put(c,1);
                 }
            }
        System.out.print(map);

    }

}
