package com.myproject.datastructures.strings;

public class ConvertDecimalToBinary {

    public static void main(String args[]){

        int x = 11;
        String reverse = "";
        while(x>0){
            int binary = x % 2;
            reverse += binary;
            x = x / 2;
        }


        for(int i=reverse.length()-1;i>=0;i--){
            System.out.print(reverse.charAt(i));
        }

    }
}
