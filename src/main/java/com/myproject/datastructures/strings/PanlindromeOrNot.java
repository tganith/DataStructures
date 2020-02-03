package com.myproject.datastructures.strings;

public class PanlindromeOrNot {

    public static void main(String args[]) {
        String str = "abcdcba";
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println(str+" is palindrome");
        } else {
            System.out.println(str+" is not palindrome");
        }
    }
}
