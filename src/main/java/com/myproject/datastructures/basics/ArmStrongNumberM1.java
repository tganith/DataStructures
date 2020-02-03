package com.myproject.datastructures.basics;

public class ArmStrongNumberM1 {

    public static void main(String[] args) {

        int num = 153;
        int copyNumber = num;
        int count = String.valueOf(num).length();
        double sum = 0;

        while(num != 0){
            int digit = num % 10;
            sum = sum + Math.pow(digit,count);
            num = num / 10;
        }

        if(copyNumber == (int)sum){
            System.out.println(copyNumber+" is armstrong number");
        } else {
            System.out.println("this number  is not armstrong number");
        }

    }
}
