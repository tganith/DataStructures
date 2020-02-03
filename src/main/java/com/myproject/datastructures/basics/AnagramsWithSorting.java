package com.myproject.datastructures.basics;

import java.util.Arrays;

public class AnagramsWithSorting {

    public static void main(String[] args) {

       String str1 = "cat";
       String str2 = "tac";

       str1.replace(" ","").toLowerCase();
       str2.replace(" ","").toLowerCase();

       char[] list1 = str1.toCharArray();
       char[] list2 = str2.toCharArray();

       Arrays.sort(list1);
       Arrays.sort(list2);

       boolean b = Arrays.equals(list1,list2);
        if(b){
            System.out.println("it's anagram");
        } else {
            System.out.println("it's not an anagram");
        }

    }
}
