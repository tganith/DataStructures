package com.myproject.datastructures.basics;

public class ConvertDecimalToBinray {


    public static void main(String args[]){

        // Method1
        int n = 5;
        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString);

        // Method2
        int x = 5;
        String reverse = "";
        while(x !=0 ){
            int d = x % 2;
            reverse += d;
            x /= 2;
        }

        for(int i =reverse.length()-1;i>=0;i--){
            System.out.print(reverse.charAt(i));
        }
    }
}
