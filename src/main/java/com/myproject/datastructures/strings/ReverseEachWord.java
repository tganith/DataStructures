package com.myproject.datastructures.strings;

public class ReverseEachWord {

    public static void main(String args[]) {
        String str = "ganitha reddy thappeta";
        String reverse = getReverseString(str);
        System.out.print(reverse);

    }


    private static String getReverseString(String str) {
        String[] words = str.split(" ");
        String reverse = "";
        for(String word:words) {

            for(int i =word.length()-1;i>=0;i--){
                reverse = reverse + word.charAt(i);
            }
            reverse = reverse+" ";
        }
        return reverse;
    }
}
