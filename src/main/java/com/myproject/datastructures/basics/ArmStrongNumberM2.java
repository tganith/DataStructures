package com.myproject.datastructures.basics;

public class ArmStrongNumberM2 {

    public static void main(String[] args) {

        int num = 153;
        int copyNumber = num;
        int count = String.valueOf(num).length();
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            int digitPow = 1;
            for(int i=0;i<count;i++){
                digitPow = digitPow*digit;
            }
            sum = sum + digitPow;
            num = num / 10;
        }

        if(copyNumber == sum){
            System.out.println(copyNumber+" is armstrong number");
        } else {
            System.out.println("this number  is not armstrong number");
        }

    }
}
