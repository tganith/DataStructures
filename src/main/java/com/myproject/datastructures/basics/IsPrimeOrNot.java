package com.myproject.datastructures.basics;

public class IsPrimeOrNot {

    // prime number means it wont divide other than 1 and self number
    //ex : 123/1 and 123/123
    //it should start from 2 and divide by 2 only
    public static void main (String[] args) {

        int x = 7;
        boolean flag = false;
        for(int i=2;i<=x/2;i++){
            if(x % i == 0){
                flag = true;
            }
        }

        if(flag){
            System.out.println(x+" is not prime number");
        } else {
            System.out.println(x+" is a prime number");
        }

    }

}
