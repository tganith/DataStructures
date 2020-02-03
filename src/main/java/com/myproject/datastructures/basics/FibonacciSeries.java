package com.myproject.datastructures.basics;

public class FibonacciSeries {


    public static void main(String args[]) {

        int sum;
        int t1 = 0;
        int t2 = 1;

        for(int i =1;i<=10;i++){
            System.out.print(t1+",");

            sum = t1+t2;
            t1 = t2;
            t2 = sum;
        }


    }
}
