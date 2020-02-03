package com.myproject.datastructures.practice;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        int num = 153;
        int original = num;

        int length = String.valueOf(num).length();
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            sum+= Math.pow(digit,length);
            num = num / 10;
        }

     //   System.out.println(sum);

        if(sum == original){
            System.out.println("armstrong number");
        } else {
            System.out.println(num);
        }
    }
}


