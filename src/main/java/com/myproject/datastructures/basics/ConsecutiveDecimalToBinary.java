package com.myproject.datastructures.basics;

public class ConsecutiveDecimalToBinary {


    public static void main(String args[]){

        int n = 13;

        if(n == 0 ){
            System.out.println(n);
            return;
        }

        String str = Integer.toBinaryString(n);

        int count = 0 ;
        int max = 1;
        for(int i = str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            if(c == '1'){
                count ++;
                if(max<count){
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(max);

    }
}
