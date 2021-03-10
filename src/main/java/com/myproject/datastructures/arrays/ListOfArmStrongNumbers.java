package com.myproject.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class ListOfArmStrongNumbers {

    public static void main(String args[]) {

        for(int i=1;i<=1000;i++){

            int num = i;
            int original = num;
            int l = String.valueOf(num).length();
            int sum =  0;

            while(num!=0){
                int d = num %10;
                sum+=Math.pow(d,l);
                num = num/10;
            }

            if(original == sum){
                System.out.print(sum+" ");
            }

        }
    }
}
