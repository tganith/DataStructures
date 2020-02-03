package com.myproject.datastructures.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramsWithMap {

    public static void main(String[] args) {

       String str1 = "cat";
       String str2 = "tac";

       boolean b = isAnagram(str1, str2);
        if(b){
            System.out.println("it's anagram");
        } else {
            System.out.println("it's not an anagram");
        }

    }

    private static boolean isAnagram(String str1, String str2) {
        str1.replace(" ","").toLowerCase();
        str2.replace(" ","").toLowerCase();

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        for(int j=0;j<str2.length();j++){
            char c = str2.charAt(j);
            if(!map.containsKey(c)){
             return false;
            }
            Integer count = map.get(c);
            if(count == 0) {
                return false;
            } else {
                map.put(c,--count);
            }
        }
        return true;

    }
}
