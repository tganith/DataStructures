package com.myproject.datastructures.strings;

public class RevereString {

    public static void main(String args[]) {
        String str = "ganitha reddy";

        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }

        System.out.print(reverse);

    }
}
